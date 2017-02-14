package com.yxhuang.java.design_pattarn.adapter;

/**
 *  场景类
 */
public class Client {
	public static void main(String[] args) {
		IUserInfo youngtGril = new OuterUserInfo();
		for (int i = 0; i < 10; i++) {
			youngtGril.getMoblieNumber();
		}
	}
}
