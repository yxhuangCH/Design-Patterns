package com.yxhuang.java.design_pattarn.observer;

/**
 *  场景类
 */
public class Client {
	public static void main(String[] args) {
		// 定义观察者
		Observer lisi = new Lisi();
		// 定义被观察者
		HanFeiZi hanFeiZi = new HanFeiZi();
		// 添加观察者
		hanFeiZi.addObserver(lisi);
		// 被观察者有改变
		hanFeiZi.haveBreakfast();
	}
}
