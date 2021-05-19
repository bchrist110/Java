package com.qa.practice.javabeginner.arrays;
import java.util.ArrayList;
import java.util.List;

public class ListsOfArays {
	
	public static void main(String[] args) {
		
		List<Integer> meat = new ArrayList<>();
		meat.add(5);
		meat.add(6);
		meat.add(7);
		meat.add(8);
		int size = meat.size();
		
		
		
//		for (int i = 0; i < meat.size(); i++) {
//		    if (size == i + 1) {
//		    	System.out.print(meat.get(i));
//		    } else {
//		    	System.out.print(meat.get(i) + ", ");
//		    }
//		} 
		
		for (int i : meat) {		    
		    System.out.print(i +" ");
		} 
		
		meat.set(0, 1);
		meat.remove(3);
		
		for (int i : meat) {		    
		    System.out.print(i +" ");
		} 
	}
}

