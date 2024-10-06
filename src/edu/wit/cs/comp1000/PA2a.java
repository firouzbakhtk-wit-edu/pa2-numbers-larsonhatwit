package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		int pos_count = 0;
		int neg_count = 0;
		int total_count = 0;
		int pos_amount = 0;
		int neg_amount =0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter five whole number: ");
		
		// Gets inputs of 5 numbers from user and adds to total count variable
		int num_1 = input.nextInt();
		total_count = total_count + num_1;
		int num_2 = input.nextInt();
		total_count = total_count + num_2;
		int num_3 = input.nextInt();
		total_count = total_count + num_3;
		int num_4 = input.nextInt();
		total_count = total_count + num_4;
		int num_5 = input.nextInt();
		total_count = total_count + num_5;
		// check if pos or neg and adds to count and amount
		if (num_1 > 0) {
			pos_count = pos_count + num_1;
			pos_amount++;
		}
		else {
			neg_count = neg_count + num_1;
			neg_amount++;
		}
		
		if (num_2 > 0) {
			pos_count = pos_count + num_2;
			pos_amount++;
		}
		else {
			neg_count = neg_count + num_2;
			neg_amount++;
		}
		
		if (num_3 > 0) {
			pos_count = pos_count + num_3;
			pos_amount++;
		}
		else {
			neg_count = neg_count + num_3;
			neg_amount++;
		}
		
		if (num_4 > 0) {
			pos_count = pos_count + num_4;
			pos_amount++;
		}
		else {
			neg_count = neg_count + num_4;
			neg_amount++;
		}
		
		if (num_5 > 0) {
			pos_count = pos_count + num_5;
			pos_amount++;
		}
		else {
			neg_count = neg_count + num_5;
			neg_amount++;
		}
		if (pos_amount == 1) {
		System.out.printf("The sum of the %d positive number: %d\n", pos_amount, pos_count);
	}
		else {
			System.out.printf("The sum of the %d positive numbers: %d\n", pos_amount, pos_count);
		}
		if (neg_amount == 1) {
			System.out.printf("The sum of the %d non-positive number: %d\n", neg_amount, neg_count);
		}
		else {
			System.out.printf("The sum of the %d non-positive numbers: %d\n", neg_amount, neg_count);
			}
		
		System.out.printf("The sum of the 5 numbers: %d\n", total_count);
		double pos_average = pos_count/pos_amount;
		double neg_average = neg_count/neg_amount;
		double total_average = total_count/5.0;
		
		if (pos_amount == 1) {
		System.out.printf("The average of the %d positive number: %.2f\n", pos_amount, pos_average);
		}
		else {
		System.out.printf("The average of the %d positive numbers: %.2f\n", pos_amount, pos_average);
		}
		if (neg_amount == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f\n", neg_amount, neg_average);
			}
			else {
			System.out.printf("The average of the %d non-positive numbers: %.2f\n", neg_amount, neg_average);
	}
		System.out.printf("The average of the 5 numbers: %.2f\n", total_average);
		
}
}