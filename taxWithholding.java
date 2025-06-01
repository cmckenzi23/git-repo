package com.csuprojects.model;
import java.util.Scanner; 
/* READ ME: 
 * Using a if-else/else-if ladder I made simple conditions outlined in the instructions. I then used those values to make a simple
 * calculation of the taxRate and income. I then output my findings as 'incomeTaxed' to the compiler for the user to see these
 * calculations. 
 */

public class taxWithholding {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in); 
		
		int income = 0; 
		double incomeTaxed = 0; 
		double taxRate = 0; 
		
		System.out.println("Enter weekly income: ");
		income = scanner.nextInt(); 
		
		if (income < 500) {
			taxRate= .10;
			incomeTaxed = income - (income * taxRate); 
			System.out.println("Your weekly income when you're taxed: " + incomeTaxed); 
		}
		else if (income >= 500 && income < 1500) {
			taxRate = .15; 
			incomeTaxed = income - (income * taxRate); 
			System.out.println("You make $500-$1500 every week so you will be taxed 15%. Here is your weekly income after taxes: " + incomeTaxed); 
		}
		else if (income >= 1500 && income < 2500) {
			taxRate = .20; 
			incomeTaxed = income - (income * taxRate); 
			System.out.println("You make $1500-$2500 every week so you will be taxed 20%. Here is your weekly income after taxes: " + incomeTaxed); 
		}
		else if (income >= 2500) {
			taxRate = .30; 
			incomeTaxed = income - (income * taxRate); 
			System.out.println("You make more than $2500 every week so you will be taxed 30%. Here is your weekly income after taxes: " + incomeTaxed); 
		}
		
	}
	
	
	
}
