package com.design.pattern.creational;

import com.design.pattern.creational.factory.ComputerScienceDepartment;
import com.design.pattern.creational.factory.DepartmentFactory;
import com.design.pattern.creational.factory.Departments;
import com.design.pattern.creational.factory.InformationSystemDepartment;
import com.design.pattern.creational.factory.models.BookModel;
import com.design.pattern.creational.factory.models.DepartmentModel;
import com.design.pattern.creational.factory.models.StudentModel;

//https://www.journaldev.com/1392/factory-design-pattern-in-java#factory-design-pattern
//https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
//https://refactoring.guru/design-patterns/factory-method

public class FactoryPatternDemo {

	public static void main(String[] args) {

		DepartmentFactory departmentFactory = new DepartmentFactory();
		Departments department = departmentFactory.CreateDepartment("ComputerScienceDepartment");

		DepartmentModel<ComputerScienceDepartment> departmentModel = new DepartmentModel<ComputerScienceDepartment>();
		departmentModel.setId(1);
		departmentModel.setDepartmentName("CS");

		BookModel<ComputerScienceDepartment> bookModel = new BookModel<ComputerScienceDepartment>("java",
				"Asmaa Ibrahim", departmentModel);
		departmentModel.addbook(bookModel);

		// ----------------Department 2 ------------------
		DepartmentModel<InformationSystemDepartment> departmentModelIs = new DepartmentModel<InformationSystemDepartment>();
		departmentModelIs.setId(2);
		departmentModelIs.setDepartmentName("IS");

		StudentModel<InformationSystemDepartment> studentModel = new StudentModel<InformationSystemDepartment>("Sarah",
				departmentModelIs);
		departmentModelIs.addStudent(studentModel);

		department.addBook(bookModel, departmentModel);
		department.createStudent(studentModel, departmentModelIs);
	}
}
