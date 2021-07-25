package Recurrsion;
import java.util.Scanner;
public class PowerOfNumber {
	static int steps_power=0;
	static int steps_fastpow=0;
	
	static long power(int n,int p) {
		steps_power++;
		if(p==0) {
			return 1;
		}
		return n*power(n,p-1);
	}
	static long fastpow(int n,int p) {
		/*
        if p==0       f=1
        if p is odd   n*fastpow(n,p-1)
        if p is even  fastpow(n*n,p/2)
		*/
		steps_fastpow++;
		if(p==0) {
			return 1;
		}
		if(p%2!=0) {
			return n*fastpow(n,p-1);
		}
		return fastpow(n*n,p/2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		System.out.println(n+ " raised to the power "+p+" using power is: "+power(n,p)+" and steps= "+steps_power);
		System.out.println(n+ " raised to the power "+p+" using fastpow is: "+fastpow(n,p)+" and steps= "+steps_fastpow);
		sc.close();
	}
}
