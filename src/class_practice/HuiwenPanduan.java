/**
 * 判断一个字符串是不是回文串，如abcba是回文串
 */
package class_practice;

import java.util.Scanner;

public class HuiwenPanduan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner =new Scanner(System.in);
		String string = scanner.next();
		int flag = 0;
		for(int i=0,j=string.length()-1;i<string.length()/2;i++,j--) {
			if(string.charAt(i)==string.charAt(j)) {
				continue;
			}else {
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("是回文串");
		}else {
			System.out.println("不是回文串");
		}
		scanner.close();
	}

}
