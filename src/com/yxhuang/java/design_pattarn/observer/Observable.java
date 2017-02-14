package com.yxhuang.java.design_pattarn.observer;

/**
 *  被观察者接口
 */
public interface Observable {
	// 增加一个观察者
	public void addObserver(Observer observer);
	// 删除一个观察者
	public void deleteObserver(Observer observer);
	// 通知变化
	public void notifyObservers(String context);
	
}
