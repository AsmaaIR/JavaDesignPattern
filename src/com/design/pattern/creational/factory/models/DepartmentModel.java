package com.design.pattern.creational.factory.models;

import java.util.ArrayList;
import java.util.List;

public class DepartmentModel {

	private int id;
	private String departmentName;
	private List<BookModel> bookList;
	private List<StudentModel> studentList;

	public DepartmentModel(int id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.bookList = new ArrayList<BookModel>();
		this.studentList = new ArrayList<StudentModel>();
	}

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

	public List<BookModel> getBookList() {
		return bookList;
	}

	public void setBookList(List<BookModel> bookList) {
		this.bookList = bookList;
	}

	public List<StudentModel> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentModel> studentList) {
		this.studentList = studentList;
	}

	/**
	 * @param bookModel
	 */
	public void addbook(BookModel bookModel) {

		if (getBookList() == null || getBookList().isEmpty()) {

			setBookList(new ArrayList<BookModel>());
		}

		bookModel.setDepartment(this);
		getBookList().add(bookModel);
	}

	/**
	 * @param studentModel
	 */
	public void addStudent(StudentModel studentModel) {

		if (getStudentList() == null || getStudentList().isEmpty()) {

			setStudentList(new ArrayList<StudentModel>());
		}
		studentModel.setDepartment(this);
		getStudentList().add(studentModel);
	}

	/**
	 * @param studentModelList
	 */
	public void addStudents(List<StudentModel> studentModelList) {

		for (StudentModel studentModel : studentModelList) {

			studentModel.setDepartment(this);
		}
		setStudentList(studentModelList);
	}

	/**
	 * @param bookModelList
	 */
	public void addBooks(List<BookModel> bookModelList) {

		for (BookModel bookModel : bookModelList) {

			bookModel.setDepartment(this);
		}
		setBookList(bookModelList);
	}
}
