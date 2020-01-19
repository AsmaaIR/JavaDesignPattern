package com.design.pattern.creational.factory.models;

public class StudentModel<T> {

	private String name;
	private DepartmentModel<T> department;

	public StudentModel(String name, DepartmentModel<T> department) {
		super();
		this.name = name;
		this.department = department;
		System.out.println("Student Name : " + name);
		System.out.println("department Name : " + department.getDepartmentName() + " department id : " + department.getId());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentModel<T> getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentModel<T> department) {
		this.department = department;
	}

}
