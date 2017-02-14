package com.yxhuang.java.design_pattarn.adapter;

import java.util.Map;

/**
 *  劳务人员信息接口
 */
public interface IOuterInfo {
	// 基本信息，例如姓名，性别，手机号码等
	public Map<String, String> getUserBaseInfo();
	// 工作区域信息
	public Map<String, String>  getUserOfficeInfo();
	// 家庭信息
	public Map<String, String> getUserHomeInfo();
	
}
