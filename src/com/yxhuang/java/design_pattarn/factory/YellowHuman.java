package com.yxhuang.java.design_pattarn.factory;

/**
 * 黄色人种
 * @author Administrator
 *
 */
public class YellowHuman implements Human {
	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤是黄色的");
	}

	@Override
	public void talk() {
		System.out.println("黄色人会说话");
	}
}
