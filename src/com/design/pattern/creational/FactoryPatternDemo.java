package com.design.pattern.creational;

import java.util.ArrayList;
import java.util.List;

import com.design.pattern.creational.factory.DepartmentFactory;
import com.design.pattern.creational.factory.Departments;
import com.design.pattern.creational.factory.models.BookModel;
import com.design.pattern.creational.factory.models.DepartmentModel;
import com.design.pattern.creational.factory.models.StudentModel;

//References:- 
//https://www.journaldev.com/1392/factory-design-pattern-in-java#factory-design-pattern
//https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
//https://refactoring.guru/design-patterns/factory-method

public class FactoryPatternDemo {

	public static void main(String[] args) {

		manageDepartment("ComputerScienceDepartment");
	}

	private static void manageDepartment(String type) {

		DepartmentFactory departmentFactory = new DepartmentFactory();
		// 1- polymorphism is applied during runtime
		// 2- encapsulation of instantiation object applied
		Departments department = departmentFactory.CreateDepartment(type);

		List<StudentModel> studentModelList = new ArrayList<StudentModel>();
		List<BookModel> bookModelList = new ArrayList<BookModel>();

		DepartmentModel departmentModel = addBooksAndStudents(bookModelList, studentModelList, type);

		department.addBook(departmentModel);
		department.createStudent(departmentModel);
	}

	private static DepartmentModel addBooksAndStudents(List<BookModel> bookModelList,
			List<StudentModel> studentModelList, String type) {

		BookModel bookModel = new BookModel("java", "Asmaa");
		StudentModel studentModel = new StudentModel("Sarah", 3);

		studentModelList.add(studentModel);
		bookModelList.add(bookModel);

		BookModel bookModel1 = new BookModel("AI", "Ibrahim");
		StudentModel studentModel1 = new StudentModel("Asmaa", 2);

		studentModelList.add(studentModel1);
		bookModelList.add(bookModel1);

		DepartmentModel departmentModel = new DepartmentModel(1, type);
		departmentModel.addBooks(bookModelList);
		departmentModel.addStudents(studentModelList);

		return departmentModel;
	}
}
