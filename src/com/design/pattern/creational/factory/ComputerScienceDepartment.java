package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.models.BookModel;
import com.design.pattern.creational.factory.models.DepartmentModel;
import com.design.pattern.creational.factory.models.StudentModel;

public class ComputerScienceDepartment implements Departments {

	@Override
	public void createStudent(DepartmentModel departmentModel) {

		if (departmentModel.getStudentList() != null && !(departmentModel.getStudentList().size() == 0)) {

			System.out.println("the Students in the department of : " + departmentModel.getDepartmentName());

			for (StudentModel studentModel : departmentModel.getStudentList()) {

				System.out.println(" the student name is: " + studentModel.getName());
				System.out.println(" the student level is: " + studentModel.getLevel());
				System.out.println();
			}
			System.out.println("-----------------------------------------");
		} else {
			System.out.println("there is no students added in CS department yet");
		}
	}

	@Override
	public void addBook(DepartmentModel departmentModel) {

		if (departmentModel.getBookList() != null && !(departmentModel.getBookList().size() == 0)) {

			System.out.println("the books in the department of : " + departmentModel.getDepartmentName());

			for (BookModel bookModel : departmentModel.getBookList()) {

				System.out.println(" the book auther is: " + bookModel.getBookAuthor());
				System.out.println(" the book name is: " + bookModel.getBookName());
				System.out.println();
			}
			System.out.println("-----------------------------------------");
		} else {
			System.out.println("there is no books added in CS department yet");
		}
	}

}
