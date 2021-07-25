package Search;
public class BinarySearch {
	static boolean find_recur(int arr[],int low,int high,int key) {
		if(low>high) {
			return false;
		}
		int mid=(low+high)/2;
		if(arr[mid]==key) {
			return true;
		}
		else if(arr[mid]>key) {
			return find_recur(arr,low,mid-1,key);
		}
		else {
			return find_recur(arr,mid+1,high,key);
		}
	}
	static boolean find_iter(int arr[],int key) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return true;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return false;
	}
	
//  find an element in an array sorted in descendng order
//	static boolean findDescending(int arr[],int key) {
//		int low=0,high=arr.length-1;
//		while(low<=high) {
//			int mid=(low+high)/2;
//			if(arr[mid]==key) {
//				return true;
//			}
//			else if(arr[mid]<key) {
//				high=mid-1;
//			}
//			else {
//				low=mid+1;
//			}
//		}
//		return false;
//	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length-1;
		System.out.println(find_iter(arr,8));
		System.out.println(find_recur(arr,0,n-1,9));
	}
}
