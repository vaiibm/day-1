package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		HashMap<String, Book> books = new HashMap<String, Book>();
		System.out.println(books.size());
		for (int i = 0; i < 10; i++) {

			books.put("book" + i, new Book("book" + i));
		}
		System.out.println(books.size());
		System.out.println(books);
		books.remove("book2");
		System.out.println(books.size());
		books.clear();
		System.out.println(books.size());
		System.out.println(books.containsKey("book 2"));

	}

}
