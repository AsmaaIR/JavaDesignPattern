package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.models.BookModel;
import com.design.pattern.creational.factory.models.DepartmentModel;
import com.design.pattern.creational.factory.models.StudentModel;

public class InformationSystemDepartment implements Departments {

	@Override
	public void createStudent(DepartmentModel departmentModel) {

		if (departmentModel.getStudentList() != null && !departmentModel.getStudentList().isEmpty()) {

			System.out.println("the Students in the department of : " + departmentModel.getDepartmentName());

			for (StudentModel studentModel : departmentModel.getStudentList()) {

				System.out.println(" the student name is: " + studentModel.getName());
				System.out.println(" the student level is: " + studentModel.getLevel());
			}
		} else {
			System.out.println("there is no students added in IS department yet");
		}
	}

	@Override
	public void addBook(DepartmentModel departmentModel) {

		if (departmentModel.getBookList() != null && !departmentModel.getBookList().isEmpty()) {

			System.out.println("the books in the department of : " + departmentModel.getDepartmentName());

			for (BookModel bookModel : departmentModel.getBookList()) {

				System.out.println(" the book auther is: " + bookModel.getBookAuthor());
				System.out.println(" the book name is: " + bookModel.getBookName());
			}
		} else {
			System.out.println("there is no books added in IS department yet");
		}
	}

}
