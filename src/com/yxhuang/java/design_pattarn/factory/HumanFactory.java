package com.yxhuang.java.design_pattarn.factory;

/**
 *  人类创建工厂
 */
public class HumanFactory extends AbstractHumanFactory{

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		// 定义一个生产的人种
		Human human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("");
		}
		return (T) human;
	}

}
