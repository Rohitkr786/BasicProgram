package day1;

import java.util.Scanner;

public class Primeno3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count,n,m;
		System.out.println("Prime no between two no");
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=n;i<m;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				
				System.out.print(i+" ");
			}	
		}
		
		sc.close();

	}

}
