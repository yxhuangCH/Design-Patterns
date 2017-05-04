package com.yxhuang.java.design_pattarn.chain.temp;

import java.io.IOException;

import com.yxhuang.java.design_pattarn.chain.Request;
import com.yxhuang.java.design_pattarn.chain.Response;

public class BridgeInterceptor implements Interceptor{

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request userRequest = chain.request();
		
		Response networkResponse = chain.proceed(userRequest);
		
		System.out.println("BridgeInterceptor intercept");
		
		return networkResponse;
	}

}
