package com.design.pattern.creational.factory.models;

public class BookModel<T> {

	private String bookName;
	private String bookAuthor;
	private DepartmentModel<T> department;

	public BookModel(String bookName, String bookAuthor, DepartmentModel<T> department) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.department = department;
		System.out.println("bookName:  " + bookName + " bookAuthor: " + bookAuthor);
		System.out.println(
				"departmentName: " + department.getDepartmentName() + " department id: " + department.getId());
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public DepartmentModel<T> getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentModel<T> department) {
		this.department = department;
	}
}
