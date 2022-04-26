package com.masai;

import java.util.*;


public class Library implements Comparator<Library>  {
	private int bookid;
	private String bookName;
	private String bookAuthor;
	
	public String toString(){
		return this.bookid+" "+this.bookName+" "+this.bookAuthor;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public Library(int bookid, String bookName, String bookAuthor) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public Library() {
		super();
	}
	@Override
	public int compare(Library o1, Library o2) {
		if(o1.getBookid()>o2.getBookid())
			return 1;
		else if(o1.getBookid()<o2.getBookid())
			return -1;
		else
			return 0;
	}
}

