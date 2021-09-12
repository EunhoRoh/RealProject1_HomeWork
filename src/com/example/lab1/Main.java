package com.example.lab2.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "Kim", 23);
		list.add(s1);
		Student s2 = new Student(102, "Lee", 21);
		list.add(s2);
		list.add(new Student(103,"Park", 25));
		list.add(new Student(105,"Roh", 18));
		list.add(new Student(106,"Ga", 85));
		list.add(new Student(107,"Hee", 15));
		list.add(new Student(108,"Sung", 35));
		list.add(new Student(109,"Woo", 40));
		list.add(new Student(110,"Ha", 10));
		list.add(new Student(104,"Ryu", 07));
	
		
		Collections.sort(list, new StudentComparator());
		
		for(Student s: list) {
			System.out.println(s.toString());
		}
		/*
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(list, new StudentComparatorDesc());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}*/

	}

}
