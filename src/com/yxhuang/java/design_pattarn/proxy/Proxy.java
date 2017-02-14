package com.yxhuang.java.design_pattarn.proxy;

/**
 *  代理类
 * @author Administrator
 *
 */
public class Proxy implements Subject{

	// 要代理哪个实现类
	private Subject subject = null;
	// 默认被代理者
	public Proxy(){
		this.subject = new Proxy();
	}
	
	// 通过构造函数传递代理者
	public Proxy(Object ...objects ){
		
	}
	
	// 实现接口中定义的方法
	@Override
	public void request() {
		// TODO Auto-generated method stub
		
	}

}
