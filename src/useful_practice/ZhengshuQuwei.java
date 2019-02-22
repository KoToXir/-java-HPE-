/**
 * 输入一个整数，截取从右到左4到7位
 */
package useful_practice;

import java.util.Scanner;

public class ZhengshuQuwei {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		char a;
		String str = num+"";
		for(int i=str.length()-4;i>=str.length()-7;i--) {
			a = str.charAt(i);
			System.out.print(a+"");
		}
		scanner.close();
	}

}
