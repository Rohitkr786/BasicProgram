package day1;

import java.util.Scanner;

public class Sumofdigit7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sum of digit in single digit");
		int n1,n,total=0;
		n=sc.nextInt();
		while(n!=0) {
			n1=n%10;
			total=n1+total;
			n=n/10;
			
		}
		System.out.println("single digit is =" +total);
		
		sc.close();

	}

}
