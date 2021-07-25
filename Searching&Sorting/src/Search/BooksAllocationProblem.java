package Search;//O(nlogn)
public class BooksAllocationProblem {
	static boolean isFeasible(int res,int k,int arr[]) {
		int students=1,sum=0;
		for(int i=0;i<arr.length;i++) {
			if(sum+arr[i]>res) {
				students++;
				sum=arr[i];
			}
			else {
				sum+=arr[i];
			}
		}
		return students<=k;
	}
	static int minPages(int arr[],int k) {
		//low=max(arr) and high=sum(arr)
		int low=Integer.MIN_VALUE,high=0,res=Integer.MAX_VALUE;
		for(int element:arr) {
			low=Math.max(low, element);
			high=high+element;
		}
		while(low<=high) {
			int mid=(low+high)/2;
			if(isFeasible(mid,k,arr)) {
				res=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr1[]= {10,10,20,40};
		int arr2[]= {12,34,67,90};
		int k=2;
		System.out.println(minPages(arr1,k));
		System.out.println(minPages(arr2,k));
	}
}
