package Search;
public class LinearSearch {
	static boolean find_recur(int arr[],int currPos,int key) {
		if(currPos==arr.length) {
			return false;
		}
		if(arr[currPos]==key) {
			return true;
		}
		return find_recur(arr,currPos+1,key);
	}
	static boolean find_iter(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(find_iter(arr,5));
		System.out.println(find_recur(arr,0,5));
	}
}
