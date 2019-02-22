package useful_practice;

public class YanghuiSanjiao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] arr;
		arr=new int[10][10];
		arr[0][0] = 1;
		for(int k1=0;k1<10-1;k1++) {
			System.out.print(" ");
		}
		System.out.println(arr[0][0]);
		for(int i=1;i<9;i++) {
			arr[i][0]=1;
			for(int k2=0;k2<10-i;k2++) {
				System.out.print(" ");
			}
			System.out.print(1+" ");
			for(int j=1;j<i;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				System.out.print(arr[i][j]+" ");
			}
			arr[i][i]=1;
			System.out.print(1+" ");
			System.out.println();
		}
	}

}
