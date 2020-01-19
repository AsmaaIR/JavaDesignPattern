package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.models.BookModel;
import com.design.pattern.creational.factory.models.DepartmentModel;
import com.design.pattern.creational.factory.models.StudentModel;

public interface Departments {

	<T> void createStudent(StudentModel<T> studentModel, DepartmentModel<T> departmentModel);

	<T> void addBook(BookModel<T> bookModel, DepartmentModel<T> departmentModel);
}
