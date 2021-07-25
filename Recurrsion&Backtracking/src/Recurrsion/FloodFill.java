package Recurrsion;
public class FloodFill {
	
	static void printMatrix(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void floodFill(int arr[][],int r,int c,int toFill,int prevFill) {
		int rows=arr.length;
		int cols=arr[0].length;
		if(r<0 || r>=rows || c<0 || c>=cols) {
			return;
		}
		if(arr[r][c]!=prevFill) {
			return;
		}
		arr[r][c]=toFill;
		floodFill(arr,r+1,c,toFill,prevFill);
		floodFill(arr,r-1,c,toFill,prevFill);
		floodFill(arr,r,c+1,toFill,prevFill);
		floodFill(arr,r,c-1,toFill,prevFill);
	}
	public static void main(String[] args) {
		int arr[][]= {{1,1,1,2,1,1,1},
					  {2,2,1,2,2,1,1}, 
					  {0,2,2,2,1,1,1},
					  {2,1,0,2,1,2,2},
					  {2,1,2,2,1,0,2}};
		int toFill=9;
		int prevFill=2;
		//(2,3) is the position to start
		int r=2;
		int c=3;
		System.out.println("Original Matrix");
		printMatrix(arr);
		floodFill(arr,r,c,toFill,prevFill);
		System.out.println("Coloured Matrix");
		printMatrix(arr);
	}

}
