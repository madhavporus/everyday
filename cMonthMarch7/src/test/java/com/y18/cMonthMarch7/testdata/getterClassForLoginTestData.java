package com.y18.cMonthMarch7.testdata;

public class getterClassForLoginTestData {
	String uid,pwd;
	
	public getterClassForLoginTestData(String uuid, String ppwd) {
		this.uid = uuid;
		this.pwd = ppwd;
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String suid) {
		this.uid = suid;
	}

	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String cpwd) {
		this.pwd=cpwd;
	}
	
	
}
