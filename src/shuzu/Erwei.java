package shuzu;

public class Erwei {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//静态初始化
		int[] arr[] = {{1,2},{3,4},{5,6}};
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = new int[][] {{1},{2}};
		//动态初始化
		int[][] arr3;
		arr3 = new int[5][];
		arr3[0] = new int[] {1,2,3,23};
		arr3[1] = new int[] {5,6,7};
		arr3[2] = new int[2];
		arr3[2][0] = 2;
		arr3[2][1] = 6;
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
