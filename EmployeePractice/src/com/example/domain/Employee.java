package com.example.domain;

public class Employee {
	private static int nextId = 101;
	private int empId;
	private String name = "Sean";
	private String ssn = "A123456789";
	private double salary;

	public Employee(String name, String ssn, double salary) {
		this.empId = nextId++;
		if(name!=null && name.trim().length()!=0)
			this.name = name;
		if(ssn!=null && ssn.trim().length()!=0)
		this.ssn = ssn;
		if(salary>=28590)
			this.salary = salary;
		else {
			System.out.println("薪水須符合最低薪資28590元");
			this.salary = 28590;
		}
	}
	
	public int getEmpId() {
		return this.empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null && name.trim().length()!=0)
			this.name = name;
		else
			System.out.println("傳入參數錯誤!");
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double increase) {
		if(increase>0)
			this.salary+=increase;
		else
			System.out.println("加薪金額需大於0");
	}

	public void displayInformation() {
		System.out.println("======員工資料======");
		System.out.println("編號: " + this.empId);
		System.out.println("姓名: " + this.name);
		System.out.println("SSN: " + this.ssn);
		System.out.println("薪水: " + this.salary);
	}

}
