package com.design.pattern.creational.factory;


// client code class
public class DepartmentFactory {

	// factory method
	public Departments CreateDepartment(String departmentName) {

		if (departmentName.equalsIgnoreCase("ComputerScienceDepartment")) {
			return new ComputerScienceDepartment();

		} else if (departmentName.equalsIgnoreCase("InformationSystemDepartment")) {
			return new InformationSystemDepartment();
		}
		return null;
	}

}
