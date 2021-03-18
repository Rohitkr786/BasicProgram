package day1;

import java.util.Scanner;

public class Sumofseries2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=1;
		float result=0;
		System.out.println("increment no");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			result+=(float)1/i;
		}
		System.out.println(result);
		
		sc.close();


	}

}
