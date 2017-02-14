package com.yxhuang.java.design_pattarn.builder;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{
	private BMWModel bmw = new BMWModel();
	
	@Override
	public void setSequence(ArrayList<String> sequenc) {
		this.bmw.setSequence(sequenc);
	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}
}
