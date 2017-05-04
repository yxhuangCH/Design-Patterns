package com.yxhuang.java.design_pattarn.chain.temp;

import java.io.IOException;

import com.yxhuang.java.design_pattarn.chain.Request;
import com.yxhuang.java.design_pattarn.chain.Response;

public interface  Interceptor {
	
	Response intercept(Chain chain) throws IOException;

	
	interface Chain{
		Request request();
		
		Response proceed(Request request) throws IOException;
		
	}
}
