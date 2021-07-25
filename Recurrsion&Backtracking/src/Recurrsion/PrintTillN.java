package Recurrsion;
import java.util.Scanner;
public class PrintTillN {

	static void printTillN(int n) {
		if(n==0) {
			return;
		}
		printTillN(n-1);
		System.out.print(n+" ");
	}
	static void printTillNreverse(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		printTillNreverse(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printTillN(n);
		System.out.println();
		printTillNreverse(n);
		sc.close();

	}
}
