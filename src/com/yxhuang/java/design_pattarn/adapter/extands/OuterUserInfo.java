package com.yxhuang.java.design_pattarn.adapter.extands;

import java.util.Map;

import com.yxhuang.java.design_pattarn.adapter.IUserInfo;

/**
 *  适配器
 */
public class OuterUserInfo implements IUserInfo{

	// 源目标对象
	private IOuterUserBaseInfo baseInfo = null;
	private IOuterUserHomeInfo homeInfo = null;
	private IOuterUserOfficeInfo officeInfo = null;
	// 数据处理
	private Map<String, String> baseMap = null;
	private Map<String, String> homeMap = null;
	private Map<String, String> officeMap = null;
	
	// 构造函数传递对象
	public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo,
			IOuterUserOfficeInfo  officeInfo ){
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
		
		// 数据处理
		this.baseMap = this.baseInfo.getUserBaseInfo();
		this.homeMap = this.homeInfo.getUserHomeInfo();
		this.officeMap = this.officeInfo.getUserOfficeInfo();
	}
	
	@Override
	public String getUserName() {
		String userName = this.baseMap.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getUserHomeAddress() {
		String homeAddress = this.homeMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMoblieNumber() {
		String mobileNumber = this.baseMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = this.officeMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = this.officeMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}
}
