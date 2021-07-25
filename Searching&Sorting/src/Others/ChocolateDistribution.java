package Others;
import java.util.Arrays;
public class ChocolateDistribution {
	static int distribute(int arr[],int nStudent) {
		//if every student get a chocolate
		if(arr.length<nStudent) {
			return Integer.MIN_VALUE;
		}
		Arrays.sort(arr);
		int minDifference=Integer.MAX_VALUE,diff;
		int i=0;
		// 1 3 4 7 9 9
		while(i+nStudent-1<arr.length) {
			diff=arr[i+nStudent-1]-arr[i];
			minDifference=Math.min(diff, minDifference);
			i++;
		}
		return minDifference;
	}

	public static void main(String[] args) {
		int arr[]={3, 4, 1, 9, 56, 7, 9, 12} ;
		int m=5;
		System.out.println(distribute(arr,m));
	}
}
