package Recurrsion;
import java.util.Scanner;
public class ReverseString {
	
	static void reverse(String str,int n) {
		if(n==0) {
			return;
		}
		System.out.print(str.charAt(n-1));
		reverse(str,n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		reverse(str,str.length());
		sc.close();
	}

}
