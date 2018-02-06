package com.cap.training;

public class HelloWorld {
	private String name;
	private String mobileno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public void printHello()
	{
		System.out.println("Welcome to Spring world : "+name +" - "+mobileno );
	}
}
