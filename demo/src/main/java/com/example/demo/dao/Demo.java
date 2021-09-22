package com.example.demo.dao;

public class Demo {
	
	String fname;
	String lname;
	
	public Demo(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "Demo [fname=" + fname + ", lname=" + lname + "]";
	}
	

}
