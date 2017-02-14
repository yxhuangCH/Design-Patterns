package com.yxhuang.java.design_pattarn.builder;

import java.util.ArrayList;

/**
 *  汽车模型抽象类
 * @author Administrator
 *
 */
public abstract class CarModel {
	
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	
	private ArrayList<String> sequence = new ArrayList<String>();
	final public void setSequence(ArrayList<String> sequence){
		this.sequence = sequence;
	}
	
	final public void run(){
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equals("start")) {
				this.start();
			} else if (actionName.equals("stop")) {
				this.stop();
			} else if (actionName.equals("alarm")) {
				this.alarm();
			} else if (actionName.equals("engine boom")) {
				this.engineBoom();
			}
		}
	}
}
