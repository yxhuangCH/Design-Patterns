package com.yxhuang.java.design_pattarn.observer;

/**
 *  具体的观察者
 */
public class Lisi implements Observer{

	// 李斯是个观察者，一旦韩非子有活动，他就知道，便会向老板汇报
	@Override
	public void update(String context) {
		System.out.println("李斯：观察到韩非子活动，开始向老板汇报····");
		this.reportToQinShiHuang(context);
	}
	
	private void reportToQinShiHuang(String reportContext){
		System.out.println("李斯：报告秦老板！韩非子有活动了---》" + reportContext);
	}

}
