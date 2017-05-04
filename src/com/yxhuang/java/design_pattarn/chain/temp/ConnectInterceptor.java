package com.yxhuang.java.design_pattarn.chain.temp;

import java.io.IOException;

import com.yxhuang.java.design_pattarn.chain.Request;
import com.yxhuang.java.design_pattarn.chain.Response;

public class ConnectInterceptor implements Interceptor{

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();
		
		Response response = new Response();
		
		System.out.println("ConnectInterceptor intercept");
		return response;
	}

}
