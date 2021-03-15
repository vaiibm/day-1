package com.ibm.sortedset;

import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		names.add("Ram");
		names.add("Ajay");
		names.add("ajay");
		names.add("ban");
		names.add("zz");
		names.add("zx");
		names.add("aadhi");
		System.out.println(names);
	}
}
