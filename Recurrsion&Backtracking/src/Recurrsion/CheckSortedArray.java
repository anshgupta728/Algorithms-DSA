package Recurrsion;
public class CheckSortedArray {
	
	static boolean checkSorted(int arr[],int n) {
		if(n==0) {
			return true;
		}
		if(arr[n]>arr[n-1]) {
			return checkSorted(arr,n-1);	
		}
		return false;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {2,4,1,6,3,9,0};
		System.out.println(checkSorted(a,6));
		System.out.println(checkSorted(b,6));
	}

}
