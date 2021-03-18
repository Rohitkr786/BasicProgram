package day1;

import java.util.Scanner;

public class Fibonacci5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,c;
		System.out.println("Fibonacci series");
		n=sc.nextInt();
		System.out.print("0 1 ");
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
		}
		sc.close();

	}

}
