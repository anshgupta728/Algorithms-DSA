package Search;
public class SearchInfiniteSorted {
	static boolean search(int arr[],int key) {
		int low=0,high=1;
		while(arr[high]<key) {
			low=high;
			high=2*high;
		}
		return BinarySearch.find_recur(arr, low, high, key);
	}
	public static void main(String[] args) {
		//Creating a very long array
		int arr[]=new int[100];
		int pos=0;
		for(int i=10;i<=500;i=i+10) {
			arr[pos++]=i;
		}
		System.out.println(search(arr,110));
		System.out.println(search(arr,20));
		System.out.println(search(arr,140));
		System.out.println(search(arr,15));
	}
}
