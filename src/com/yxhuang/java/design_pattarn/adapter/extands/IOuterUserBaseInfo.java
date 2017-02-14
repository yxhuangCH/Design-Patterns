package com.yxhuang.java.design_pattarn.adapter.extands;

import java.util.Map;

/**
 *  劳务人员基本信息接口
 */
public interface IOuterUserBaseInfo {
	// 基本信息，例如姓名，性别，手机号等
	public Map<String, String> getUserBaseInfo();
}
