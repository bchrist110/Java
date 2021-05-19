package com.qa.practice.javabeginner.conditionals;

public class results2 {
	int physics;
	int chemistry;
	int biology;
	
	int examsFailed;
	
	int total;
	int percentage;
	
	public void displayResults() {
		total = physics + chemistry + biology;
		
		String output = "Physics: " + physics + "/150\n"
				+ "Chemistry: " + chemistry + "/150\n"
				+ "Biology: " + biology + "/150\n"
				+ "Total: " + total + "/450\n";
		
		int chemistryPercentage = calculateExamPercentage(chemistry);
		int biologyPercentage = calculateExamPercentage(biology);
		int physicsPercentage = calculateExamPercentage(physics);

		
		if (percentage < 60 || chemistryPercentage < 60 || biologyPercentage < 60 || physicsPercentage < 60) {
			output += "Failed: " + percentage + "%";
		} else {
			output += "Passed: " + percentage + "%";
		}
		
		System.out.println(output);
	}
	
	public void calculatePercentage() {
		total = physics + chemistry + biology;
		percentage = total * 100 / 450;
		
	}
	
	public calculateExamPercentage(int score) {
		return score * 100 / 150;
	}
	
	public static void main(String[] args) {
		Results2 results = new Results
	}
}
