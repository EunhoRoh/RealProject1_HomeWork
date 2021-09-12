package com.example.lab2.first;

import java.util.Comparator;

class StudentComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
class StudentComparatorDesc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
	
}