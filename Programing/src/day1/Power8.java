package day1;

import java.util.Scanner;

public class Power8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("power of number");
		int n,m,i,power=1;
		m=sc.nextInt();
		n=sc.nextInt();
		i=n;
		//power=(int) Math.pow(m, n); //function of power
		while(i!=0) {
			power*=m;
			--i;
		}
		System.out.println(" m ^ n = "+power);
		sc.close();
	}

}
