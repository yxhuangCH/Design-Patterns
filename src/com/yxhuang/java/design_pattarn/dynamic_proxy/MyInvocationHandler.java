package com.yxhuang.java.design_pattarn.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 *  动态代理的 Handler 类
 * @author Administrator
 *
 */
public class MyInvocationHandler implements InvocationHandler{

	// 被代理的对象
	private Object targert = null;
	
	public MyInvocationHandler(Object _obj){
		this.targert = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 执行被代理的方法
		return method.invoke(this.targert, args);
	}

}
