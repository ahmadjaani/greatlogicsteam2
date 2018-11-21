package com.gl.basics;

public class Account {
	private long acno;
	private String ifsc;

	public long getAcno() {
		return acno;
	}

	public void setAcno(long acno) {
		this.acno = acno;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", ifsc=" + ifsc + "]";
	}
}
