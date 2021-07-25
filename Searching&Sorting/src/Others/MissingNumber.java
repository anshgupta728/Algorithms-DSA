package Others;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNumber {
	
	static void findMissing(int arr[]) {
		Arrays.sort(arr);
		int k=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=k) {
				System.out.println("Missing Number: "+k);
				break;
			}
			k++;
		}
	}
	
//	static void findMissing(int arr[]) {
//		for(int i=1;i<=arr.length;i++) {
//			boolean found=false;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[j]==i) {
//					found=true;
//					break;
//				}
//			}
//			if(!found) {
//				System.out.println("Missing Number: "+i);
//				break;
//			}
//		}
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		findMissing(arr);
		sc.close();
	}
}
