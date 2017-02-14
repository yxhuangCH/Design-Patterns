package com.yxhuang.java.design_pattarn.adapter.extands;

import com.yxhuang.java.design_pattarn.adapter.IUserInfo;

/**
 *  场景类
 */
public class Client {
	public static void main(String[] args) {
		// 劳务人员信息
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		// 传递三个对象
		IUserInfo youngGril = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
		// 从数据库中查十个
		for(int i = 0; i < 10; i++){
			youngGril.getMoblieNumber();
		}
	}
}

















