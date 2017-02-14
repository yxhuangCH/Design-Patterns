package com.yxhuang.java.design_pattarn.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 *  动态代理类
 * @author Administrator
 *
 */
public class DynamicProxy<T> {
	
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[]
			interfaces, InvocationHandler h){
		// 执行目标，并放回结果
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}

}
