package com.ibm;

public class Application {
public static void main(String[] args) {
	Book book = new Book();
	try {
	book.setTitle("ram");
	
	} 
	catch (IllegalArgumentException illegalArgumentException) {
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("always");
	}
	System.out.println(book.toString());
	//Book book1 = new Book();
//	book1.setTitle("again");
	//System.out.println(book1);
	
}
}

class Book {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if(title==null) {
			throw new Exception();
		}
		this.title = title;
		}
	
	@Override
	public String toString() {
		return this.title;
	}
}
