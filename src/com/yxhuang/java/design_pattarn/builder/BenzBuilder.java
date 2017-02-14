package com.yxhuang.java.design_pattarn.builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

	private BenzModel benz = new BenzModel();
	
	@Override
	public void setSequence(ArrayList<String> sequenc) {
		this.benz.setSequence(sequenc);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
