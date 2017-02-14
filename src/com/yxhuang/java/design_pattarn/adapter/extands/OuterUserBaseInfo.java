package com.yxhuang.java.design_pattarn.adapter.extands;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {
	
	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> baseInfo = new HashMap<String, String>();
		baseInfo.put("userName", "劳务人员姓名");
		baseInfo.put("mobileNumber", "劳务人员电话");
		return baseInfo;
	}

}
