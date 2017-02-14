package com.yxhuang.java.design_pattarn.builder;

import java.util.ArrayList;

public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();

	public BenzModel getABenzModel(){
		// 记得清除
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	public BMWModel getBmwModel(){
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(this.sequence);
		
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
}
