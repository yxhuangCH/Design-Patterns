package com.yxhuang.java.design_pattarn.chain.temp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.yxhuang.java.design_pattarn.chain.Request;

public class TempClient {
	
	public static void main(String[] args) throws IOException {
		
		List<Interceptor> interceptors = new ArrayList<Interceptor>();
		interceptors.add(new BridgeInterceptor());
		interceptors.add(new CacheInterceptor());
		interceptors.add(new ConnectInterceptor());
		
		Request request = new Request();
		Interceptor.Chain chain = new RealInterceptorChain(interceptors, 0, request);
		chain.proceed(request);
		
		/**
		 *  执行结果， 倒序
		 *   ConnectInterceptor intercept
		 *   CacheInterceptor intercept
         *   BridgeInterceptor intercept
		 */
	}

}
