package com.y18.cMonthMarch12.testdata;

public class GetterSetterOfLoginPageTestData {
	
	String uid,pwd,pageTitle, expectedPageTitleOfCreateList;
	
	public GetterSetterOfLoginPageTestData(String uuid, String ppwd, String ppageTitle, String eexpectedPageTitleOfCreateList) {
		this.uid = uuid;
		this.pwd = ppwd;
		this.pageTitle = ppageTitle;
		this.expectedPageTitleOfCreateList = eexpectedPageTitleOfCreateList;
	}

	public String getUid() {
		return uid;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getLoginPageTitle() {
		return pageTitle;
	}
	
	public String getexpectedPageTitleOfCreateList() {
		return expectedPageTitleOfCreateList;
	}
}
