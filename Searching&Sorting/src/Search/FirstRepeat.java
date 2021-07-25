package Search;
import java.util.*;
public class FirstRepeat {
	//3 2 1 2 2 3
	static void firstRepeat(int arr[]) {
		Set<Integer> set=new HashSet<>();
		int minIndex=-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(set.contains(arr[i])) {
				minIndex=i;
			}
			else {
				set.add(arr[i]);
			}
		}
		if(minIndex!=-1)
			System.out.println("First Repeating Element: "+arr[minIndex]);
		else
			System.out.println("No Repeating Element");
	}
//	static void firstRepeat(int arr[]) {
//		int index=-1,minIndex=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					index=i;
//				}
//			}
//			minIndex=Math.min(index, minIndex);
//		}
//		if(minIndex!=-1)
//			System.out.println("First Repeating Element: "+arr[minIndex]);
//		else
//			System.out.println("No Repeating Element");
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		firstRepeat(arr);
		sc.close();
	}
}