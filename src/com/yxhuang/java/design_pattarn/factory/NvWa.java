package com.yxhuang.java.design_pattarn.factory;

/**
 *  女娲类（场景类）
 */
public class NvWa {
	public static void main(String[] args) {
		// 声明工厂
		AbstractHumanFactory humanFactory = new HumanFactory();
		Human blackHuman = humanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}










