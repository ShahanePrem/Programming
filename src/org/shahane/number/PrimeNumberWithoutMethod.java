package org.shahane.number;

import java.util.Scanner;

public class PrimeNumberWithoutMethod {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Entre The Number");
		int number=scanner.nextInt();
		int count=0;
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				count++;
			}
		}
		System.out.println(count==2?number+" Is A Prime Number":number+"Is Not A Prime Number");
		scanner.close();
	}
}
