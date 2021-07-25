package Recurrsion;
import java.util.Scanner;
public class Fibonacci {
	//fibonacci(0)=0 && fibonacci(1)=1
	static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n+"th term of fibonacci series is: "+fibo(n));
		sc.close();
	}

}
