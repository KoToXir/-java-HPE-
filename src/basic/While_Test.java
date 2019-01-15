package basic;

import java.util.Scanner;

public class While_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//100以内2的倍数的和
		int i=2,sum = 0;
		while(i<=100) {
			sum +=i;
			i +=2;
		}
		System.out.println(sum);
		
		//100以内4的倍数的和
		int j=4,sun=0;
		while(j<=100) {
			sun += j;
			j += 4;
		}
		System.out.println(sun);
		
		//判断正数负数个数
		System.out.println("请输入不定个数的整数，以0结束输入");
		int zs = 0,fs = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input = sc.nextInt();
			if(input>0) {
				zs += 1;
			}else if (input<0) {
				fs += 1;
			}else {
				break;
			}
		}
		System.out.println("正数为"+zs+"个，"+"负数为"+fs+"个");
		sc.close();
	}

}
