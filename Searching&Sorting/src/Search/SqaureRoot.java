package Search;
public class SqaureRoot {
//	static int calc(int num) {
//		int ans=0;
//		for(int i=0;i<=num;i++) {
//			if(i*i==num) {
//				return i;
//			}
//			else if(i*i<num) {
//				ans=i;
//			}
//			else if(i*i>num) {
//				return ans;
//			}
//		}
//		return 0;
//	}
	
	static int floorSqrtcalc(int num) {
		if(num==0||num==1) {
			return num;
		}
		int low=1,high=num,ans=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(mid*mid<=num) {
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int num=9;
		System.out.println(floorSqrtcalc(num));
	}

}
