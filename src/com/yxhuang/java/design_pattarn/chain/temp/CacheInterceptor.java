package com.yxhuang.java.design_pattarn.chain.temp;

import java.io.IOException;

import com.yxhuang.java.design_pattarn.chain.Request;
import com.yxhuang.java.design_pattarn.chain.Response;

public class CacheInterceptor implements Interceptor{

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();
		
		Response response = chain.proceed(request);
		
		System.out.println("CacheInterceptor intercept");
		return response;
	}

}
