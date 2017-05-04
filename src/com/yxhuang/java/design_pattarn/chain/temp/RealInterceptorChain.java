package com.yxhuang.java.design_pattarn.chain.temp;


import java.io.IOException;
import java.util.List;

import com.yxhuang.java.design_pattarn.chain.Request;
import com.yxhuang.java.design_pattarn.chain.Response;
import com.yxhuang.java.design_pattarn.chain.temp.Interceptor.Chain;

public class RealInterceptorChain implements Interceptor.Chain{

	private final List<Interceptor> interceptors;
	private final int index;
	private final Request request;
	private int calls;
	
	public RealInterceptorChain(List<Interceptor> interceptors, int index, Request request) {
		this.interceptors = interceptors;
		this.index = index;
		this.request = request;
	}

	@Override
	public Request request() {
		return request;
	}

	@Override
	public Response proceed(Request request) throws IOException {
		if (index >= interceptors.size()) {
			throw new AssertionError();
		}
		
		calls++;
		
		// Call the next interceptor in the chain.
		RealInterceptorChain next = new RealInterceptorChain(interceptors, index + 1, request);
		Interceptor interceptor = interceptors.get(index);
		Response response = interceptor.intercept(next);
		
		// Confirm that the next interceptor made its required call to  chain.proceed().
		if (index + 1 < interceptors.size() && next.calls != 1) {
			throw new IllegalStateException("network interceptor " + interceptor
					+ " must call proceed() exactly once");
		}
		
		// Confirm that the intercepted response isn't null.
		if (response == null) {
			throw new NullPointerException("interceptor " + interceptor  + " returned null");
		}
		return response;
	}

}
