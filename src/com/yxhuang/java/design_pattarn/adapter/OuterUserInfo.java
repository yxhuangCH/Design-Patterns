package com.yxhuang.java.design_pattarn.adapter;

import java.util.Map;

/**
 *  中转角色
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{
	// 员工的基本信息
	private Map<String, String> baseInfo = super.getUserBaseInfo();
	// 员工的家庭信息
	private Map<String, String> homeInfo = super.getUserHomeInfo();
	// 员工的工作信息
	private Map<String, String> officeInfo = super.getUserOfficeInfo();

	@Override
	public String getUserName() {
		String userName = baseInfo.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getUserHomeAddress() {
		String homeAddress = homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMoblieNumber() {
		String mobileNumber = baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = officeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

}
