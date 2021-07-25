package Search;
//10 20 30 40 50
public class PeakElement {
	static int findPeak(int arr[],int n) {
		int low=0,high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(mid>0 && mid<n-1) {
				if(arr[mid]>=arr[mid-1]&&arr[mid]>arr[mid+1]) {
					return arr[mid];
				}
				else if(arr[mid-1]>arr[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else if(mid==0) {
				if(arr[0]>arr[1]) {	
					return arr[0];
				}
				else {
					return arr[1];
				}
			}
			else if(mid==n-1){
				if(arr[n-1]>arr[n-2]) {
					return arr[n-1];
				}
				else {
					return arr[n-2];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {10, 20, 15, 2, 23, 90, 67};
		System.out.println("Peak Element: "+findPeak(arr,arr.length));
	}
}
