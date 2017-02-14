package com.yxhuang.java.design_pattarn.adapter.extands;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> officeInfo = new HashMap<String, String>();
		officeInfo.put("jobPosition", "劳务人员职位");
		officeInfo.put("officeTelNumber", "劳务人员办公号码");
		return officeInfo;
	}
}
