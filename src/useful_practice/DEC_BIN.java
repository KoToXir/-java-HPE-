/**
 * 十进制转二进制
 */
package useful_practice;

import java.util.Scanner;

public class DEC_BIN {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		String str = "";
		while (n != 0) {
			str = n % 2 + str;
			n = n / 2;
		}
		System.out.println(str);
		scanner.close();
	}

}
