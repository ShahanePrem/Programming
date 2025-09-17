package org.shahane.number;

import java.util.Scanner;

public class PrimeNumberWithMethodRecursion {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Entre The Number");
		int number=scanner.nextInt();
		System.out.println(isPrime(number,0,1));
		scanner.close();
	}
	public static String isPrime(int number, int count ,int i) {
		if (i>number) {
			return count==2?"Its Prime" : "Its Not Prime";
		} else {
			if(number%i==0)count++;
			i++;
			return isPrime(number, count, i);
		}
	}
}
