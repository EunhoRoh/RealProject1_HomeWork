package com.example.lab2.second;

import java.util.Comparator;

class FruitComparator implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
class FruitComparatorDesc implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
	
}