package com.tnsif.daysix;

public class Citizen
{
	private String name;
	private String aadharno;
	private long phon_no;
	private String address;
	{
	
		System.out.println("Object was created:");
		
	}
	public Citizen(String name, String aadharno, long phon_no, String address) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.phon_no = phon_no;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public long getPhon_no() {
		return phon_no;
	}
	public void setPhon_no(long phon_no) {
		this.phon_no = phon_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

