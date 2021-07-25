package Recurrsion;
public class FirstOccurrence {
	
	static int lastOccurr(int a[],int n,int i,int key) {
		if(i==n) {
			return -1;
		}
		if(a[i]==key) {
			return i;
		}
		return lastOccurr(a,n,i-1,key); 
	}
	static int firstOccurr(int a[],int n,int i,int key) {
		if(i==n) {
			return -1;
		}
		if(a[i]==key) {
			return i;
		}
		return firstOccurr(a,n,i+1,key);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,6,2,6,7};
		int n=7;
		int i=0;
		int key1=2;
		int key2=6;
		int key3=7;
		//Traversing Left to Right
		System.out.println(firstOccurr(a,n,i,key1));
		System.out.println(firstOccurr(a,n,i,key2));
		System.out.println(firstOccurr(a,n,i,key3));
		i=n-1;
		n=-1;
		//Traversing Right to Left
		System.out.println(lastOccurr(a,n,i,key1));
		System.out.println(lastOccurr(a,n,i,key2));
		System.out.println(lastOccurr(a,n,i,key3));
	}

}
