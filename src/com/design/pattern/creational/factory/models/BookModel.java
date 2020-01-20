package com.design.pattern.creational.factory.models;

public class BookModel {

	private String bookName;
	private String bookAuthor;
	private DepartmentModel department;

	public BookModel(String bookName, String bookAuthor) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
//		this.department = department;
//		System.out.println("bookName:  " + bookName + " bookAuthor: " + bookAuthor);
//		System.out.println(
//				"departmentName: " + department.getDepartmentName() + " department id: " + department.getId());
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

	public DepartmentModel getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}
}
