package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = Math.pow(b,2) - (4*a*c);
		
		if (d < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		else if (d == 0) {
			double root = (-1*b) / (2*a);
			System.out.printf("Root: %.2f%n", root);
		}
		else {
			double root_1 = (-1*b + Math.sqrt(d)) / (2*a);
			double root_2 = (-1*b - Math.sqrt(d)) / (2*a);
			System.out.printf("Roots: %.2f, %.2f%n", root_2, root_1);
		}
	}

}
