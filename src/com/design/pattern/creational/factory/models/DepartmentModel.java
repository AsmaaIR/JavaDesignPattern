package com.design.pattern.creational.factory.models;

import java.util.ArrayList;
import java.util.List;

public class DepartmentModel<T> {

	private int id;
	private String departmentName;
	private List<BookModel<T>> bookList;
	private List<StudentModel<T>> studentList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<BookModel<T>> getBookList() {
		return bookList;
	}

	public void setBookList(List<BookModel<T>> bookList) {
		this.bookList = bookList;
	}

	public List<StudentModel<T>> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentModel<T>> studentList) {
		this.studentList = studentList;
	}

	/**
	 * @param bookModel
	 */
	public void addbook(BookModel<T> bookModel) {

		if (getBookList() == null || getBookList().isEmpty()) {

			setBookList(new ArrayList<BookModel<T>>());
		}

		bookModel.setDepartment(this);
		getBookList().add(bookModel);
	}

	/**
	 * @param studentModel
	 */
	public void addStudent(StudentModel<T> studentModel) {

		if (getStudentList() == null || getStudentList().isEmpty()) {

			setStudentList(new ArrayList<StudentModel<T>>());
		}
		studentModel.setDepartment(this);
		getStudentList().add(studentModel);
	}
}
