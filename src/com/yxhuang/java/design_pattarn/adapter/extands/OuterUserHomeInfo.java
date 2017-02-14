package com.yxhuang.java.design_pattarn.adapter.extands;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo{

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("homeAdrress", "劳务人员住址");
		homeInfo.put("homeTelNumber", "劳务人员家庭号码");
		return homeInfo;
	}

}
