package Recurrsion;
import java.util.*;
/*Finding number of paths from first cell of a matrix to last cell by only moving right and down*/ 
public class PathsInMxNArray {
	
	static int findPath(int m,int n) {
		if(n==1 || m==1) {
			return 1;
		}
		return findPath(m,n-1) + findPath(m-1,n);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(findPath(m,n));
		sc.close();
	}

}
