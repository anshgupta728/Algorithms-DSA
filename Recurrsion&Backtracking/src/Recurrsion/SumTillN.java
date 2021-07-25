package Recurrsion;
import java.util.Scanner;
public class SumTillN {
	
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum of natural numbers till "+n+" is: "+sum(n));
		sc.close();
	}

}
