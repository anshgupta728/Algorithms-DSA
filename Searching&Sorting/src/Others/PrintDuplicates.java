package Others;
import java.util.*;
public class PrintDuplicates {
	static void printDuplicate(int arr[]) {
		HashSet<Integer> s=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(s.contains(arr[i])) {
				System.out.println("Duplicates of "+arr[i]+" exist");
			}
			s.add(arr[i]);
		}
	}
//	static void printDuplicate(int arr[]) {
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]==arr[i+1]) {
//				System.out.println("Duplicates of "+arr[i]+" exist");
//			}
//		}
//	}
	public static void main(String[] args) {
		int arr[]= {1,5,9,3,7,1,8,5,7};
		printDuplicate(arr);
	}
}
