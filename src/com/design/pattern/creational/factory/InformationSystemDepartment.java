package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.models.BookModel;
import com.design.pattern.creational.factory.models.DepartmentModel;
import com.design.pattern.creational.factory.models.StudentModel;

public class InformationSystemDepartment implements Departments {

	@Override
	public <T> void createStudent(StudentModel<T> studentModel, DepartmentModel<T> departmentModel) {

		studentModel.setDepartment(departmentModel);
		departmentModel.addStudent(studentModel);
	}

	@Override
	public <T> void addBook(BookModel<T> bookModel, DepartmentModel<T> departmentModel) {

		bookModel.setDepartment(departmentModel);
		departmentModel.addbook(bookModel);
	}

}
