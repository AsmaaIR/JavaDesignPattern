package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.models.DepartmentModel;

public interface Departments {

	void createStudent(DepartmentModel departmentModel);

	void addBook(DepartmentModel departmentModel);
}
