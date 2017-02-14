package com.yxhuang.java.design_pattarn.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 *  劳务人员的实现类
 */
public class OuterUser implements IOuterInfo{

	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> basHashMap = new HashMap<String, String>();
		basHashMap.put("userName", "劳务人员姓名");
		basHashMap.put("mobileNumber", "劳务人员手机号码");
		return basHashMap;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> officeInfo = new HashMap<String, String>();
		officeInfo.put("jobPosition", "劳务人员职位");
		officeInfo.put("officeTelNumber", "劳务人员办公号码");
		return officeInfo;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("homeAddress", "劳务人员住址");
		homeInfo.put("homeTelNumber", "劳务人员家庭号码");
		return homeInfo;
	}

}
