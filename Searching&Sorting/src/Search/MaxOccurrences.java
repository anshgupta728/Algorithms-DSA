package Search;
import java.util.*;
public class MaxOccurrences {
	static void maxOccurr(int arr[],int n) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.replace(arr[i],map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		int max=Collections.max(map.values());
		System.out.println(max);
	}
	
	static void maxOccurr(int arr[]) {
		int count,maxCount=0,element=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				element=arr[i];
			}
		}
		System.out.println(element+" has highest occurrences equal to: "+maxCount);
	}
	
	public static void main(String[] args) {
		int arr[]= {7,1,5,9,3,7,1,8,5,7,1,7,5,7,8};
		maxOccurr(arr);
		maxOccurr(arr,arr.length);
	}
}
