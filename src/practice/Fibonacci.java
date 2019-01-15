/**
 * 古典问题：
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假
 * 如兔子都不死，问每个月的兔子总数为多少？
 */
package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner mouth =new Scanner(System.in);
		int mm = mouth.nextInt();
		int[] sum=new int[mm+1];
		sum[1]=2;sum[2]=2;
		for(int i=1;i<mm+1;i++) {
			if (i>2) {
				sum[i]=sum[i-1]+sum[i-2];	
				
			}
			System.out.println("第"+i+"个月共有"+sum[i]+"只");
		}
		mouth.close();
	}

}
