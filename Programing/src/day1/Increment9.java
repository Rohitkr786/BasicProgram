package day1;

import java.util.Scanner;

public class Increment9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=1,result=1;
		System.out.println("increment no");
		n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			result= ++n;
			n=n/10;
			System.out.println(result);
			
		}
		
		
		sc.close();

	}

}
