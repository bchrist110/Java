package com.qa.practice.javabeginner.arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> meat = new ArrayList<>();
		meat.add(5);
		for (int i = 0; i < meat.size(); i++) {
		    System.out.println(meat.get(i));
		}
	}
}
