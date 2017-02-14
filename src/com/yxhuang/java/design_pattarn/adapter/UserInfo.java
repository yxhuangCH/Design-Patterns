package com.yxhuang.java.design_pattarn.adapter;

/**
 *  员工实现类
 */
public class UserInfo implements IUserInfo{

	@Override
	public String getUserName() {
		System.out.println("员工姓名");
		return null;
	}

	@Override
	public String getUserHomeAddress() {
		System.out.println("员工住址");
		return null;
	}

	@Override
	public String getMoblieNumber() {
		System.out.println("员工手机号码");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("员工办公号码");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("员工职位");
		return null;
	}

}
