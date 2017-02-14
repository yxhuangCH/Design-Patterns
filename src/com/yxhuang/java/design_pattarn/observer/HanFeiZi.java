package com.yxhuang.java.design_pattarn.observer;

import java.util.ArrayList;

/**
 *  被观察者实现类
 */
public class HanFeiZi implements Observable, IHanFeiZi{

	// 定义个变长数组，存放所有的观察者
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		for(Observer observer : observerList){
			observer.update(context);
		}
	}

	@Override
	public void haveBreakfast() {
		System.out.println("韩非子： 开始吃饭了····");
		// 通知所有的观察者
		this.notifyObservers("韩非子在吃饭");
	}

	@Override
	public void havaFun() {
		System.out.println("韩非子： 开始娱乐···");
		this.notifyObservers("韩非子在娱乐");
	}

}
