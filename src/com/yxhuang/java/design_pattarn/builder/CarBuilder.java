package com.yxhuang.java.design_pattarn.builder;

import java.util.ArrayList;

/**
 *  抽象汽车组装类
 * @author Administrator
 *
 */
public abstract class CarBuilder {
	public abstract void setSequence(ArrayList<String> sequenc);
	public abstract CarModel getCarModel();
}
