/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 */
package practice;

public class Fibonacci_Fenshu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] A =new int[20];	//分子
		int[] B =new int[20];	//分母
		A[0] = 2;A[1] = 3;
		B[0] = 1;B[1] = 2;
		double sum = 0;
		//先存入分子分母的值
		for(int i=2;i<20;i++) {
			A[i] = A[i-1] + A[i-2];
			B[i] = B[i-1] + B[i-2];
		}
		//计算分数相加的和
		for(int j=0;j<20;j++) {
			sum += (double)A[j]/(double)B[j];
		}
		System.out.println(sum);
	}

}
