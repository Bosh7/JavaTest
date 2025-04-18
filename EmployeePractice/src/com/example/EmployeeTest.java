package com.example;

import com.example.domain.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Sean", "A123456789", 50000);
		Employee emp2 = new Employee("Amy", "B123456789", 75000);
		emp1.displayInformation();
		emp2.displayInformation();
		System.out.println("Amy結婚並獲得加薪1000元");
		emp2.setName("Amy Wamg");
		emp2.raiseSalary(1000);
		emp2.displayInformation();
	}

}
