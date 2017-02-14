package com.yxhuang.java.design_pattarn.adapter;

/**
 *  员工信息接口
 */
public interface IUserInfo {
	// 获取用户姓名
	public String getUserName();
	// 获取家庭地址
	public String getUserHomeAddress();
	// 手机号码
	public String getMoblieNumber();
	// 办公号码
	public String getOfficeTelNumber();
	// 职位
	public String getJobPosition();
	
}
