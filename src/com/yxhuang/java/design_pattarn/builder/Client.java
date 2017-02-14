package com.yxhuang.java.design_pattarn.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		director.getABenzModel().run();
		director.getBmwModel().run();
	}
}


