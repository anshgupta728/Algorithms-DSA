package Search;
public class SearchInSortedRotated {
	static boolean search(int arr[],int key) {
		int low=0,high=arr.length-1;boolean found=false;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				found=true;
				break;
			}
			else if(arr[low]<=arr[mid]) {
				if(arr[low]<=key && arr[mid]>key) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if(arr[mid]<key && arr[high]>=key) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
		}
		return found;
	}
	public static void main(String[] args) {
		int arr[]= {20,30,40,50,60,5,10};
		System.out.println(search(arr,20));
	}
}
