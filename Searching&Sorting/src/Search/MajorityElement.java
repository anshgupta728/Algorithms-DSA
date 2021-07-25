package Search;
public class MajorityElement {
//	static int majElement(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			int count=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			if(count>arr.length/2) {
//				return arr[i];
//			}
//		}
//		return -1;
//	}
	
	//More's Voting Algorithm
	static int majElement(int arr[]) {
		int ansIndex=0,count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[ansIndex]) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				ansIndex=i;
				count=1;
			}
		}
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[ansIndex]) {
				count++;
			}
		}
		if(count>arr.length/2) {
			return arr[ansIndex];
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,2,5,1,1,1};
		System.out.println(majElement(arr));
	}
}
