package com.ibm.linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.ibm.Book;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for (int i = 0; i < 500; i++) {
			names.add("Vai" + i);
		}

		System.out.println(names.size());
		names.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				boolean myBoolean = (s2.equals(s1));
				int myInt = myBoolean ? 1 : -1;
				return myInt;
			}
		});
		System.out.println(names);
	}
}
