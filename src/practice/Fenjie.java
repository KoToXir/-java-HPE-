/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
package practice;

import java.util.Scanner;

public class Fenjie {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner aa = new Scanner(System.in);
		int aaa=aa.nextInt();
		int aaaa = aaa;
//		System.out.print("1");
		for(int i=2;i<=aaa;i++) {
			while(aaaa%i==0) {
				aaaa/=i;
				if(aaaa==1) {
					System.out.print(i);
				}else {
					System.out.print(i+"*");
				}		
			}
		}	
		aa.close();
	}
}
