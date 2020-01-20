package com.design.pattern.creational.factory.models;

public class StudentModel {

	private String name;
	private int level;
	private DepartmentModel department;

	public StudentModel(String name, int level) {
		super();
		this.name = name;
		this.setLevel(level);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentModel getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
