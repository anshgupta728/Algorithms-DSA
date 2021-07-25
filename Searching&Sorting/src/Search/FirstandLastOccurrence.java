package Search;

public class FirstandLastOccurrence {
	static int lastOccurr(int arr[],int key) {
		int low=0,high=arr.length-1,res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				res=mid;
				low=mid+1;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return res;
	}
	static int firstOccurr(int arr[],int key) {
		int low=0,high=arr.length-1,res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				res=mid;
				high=mid-1;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,10,10,10,18,20};
		int key=10;
		System.out.println(firstOccurr(arr,key));
		System.out.println(lastOccurr(arr,key));
		if (firstOccurr(arr,key)==-1 || lastOccurr(arr,key)==-1) {
			System.out.println("Count=0");
		}
		else {
			System.out.println("Count = "+(lastOccurr(arr,key)-firstOccurr(arr,key)+1));
		}
	}
}
