package day1;
import java.util.Scanner;

public class CheckPrimeno1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("check prime no or not");
		int n,flag=0;
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime no is " +n);
		}
		else {
			
		
		System.out.println("not prime no " +n);
		sc.close();
		}

	}

}
