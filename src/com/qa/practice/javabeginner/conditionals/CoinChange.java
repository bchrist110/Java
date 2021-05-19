package com.qa.practice.javabeginner.conditionals;
import java.lang.Math;

public class CoinChange {
	
	public void findChange(double cost, double payment ) {
		double totalLeft = payment - cost;
		String change = "";
		if (totalLeft > 10) {
			change += "1 10 note, " ;
			totalLeft -= 10;
			if (totalLeft > 5) {
				change += "1 5 note, " ;
				totalLeft -= 5;
				if (totalLeft < 5 && totalLeft > 1) {
					double roundedTotalLeft = Math.round(totalLeft);
					change += roundedTotalLeft +  " 1 note, " ;
					totalLeft -= roundedTotalLeft;
				}
			}
			if (totalLeft < 5 && totalLeft > 1) {
				double roundedTotalLeft = Math.round(totalLeft);
				change += roundedTotalLeft +  " 1 note, " ;
				totalLeft -= roundedTotalLeft;
			}
		}
	}
}
