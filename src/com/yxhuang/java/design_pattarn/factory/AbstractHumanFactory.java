package com.yxhuang.java.design_pattarn.factory;

/**
 * 抽象人类创建工厂
 */
public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
