/**
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
package practice;

import java.util.Scanner;

public class AandAA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入底数");
		Scanner sc = new Scanner(System.in);
		int ds = sc.nextInt();
		System.out.println("输入指数");
		int zs = sc.nextInt();
		int sum=0;
		for(int i=0;i<zs;i++) {
			sum+=sum+ds*Math.pow(10,i);
			System.out.println(sum);
		}
		sc.close();
	}

}
