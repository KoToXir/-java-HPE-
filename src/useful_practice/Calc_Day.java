/**
 * 输入月份和日期，计算是一年中的第几天
 * case下滑
 */
package useful_practice;

import java.util.Scanner;

public class Calc_Day {

	public static void main(String[] args) {
		
		System.out.println("输入月");
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("输入日");
		int d = sc.nextInt();
		sc.close();
		
		int sumDay = 0;
		switch (m) {
		case 12:
			sumDay += 30;
		case 11:
			sumDay += 31;
		case 10:
			sumDay += 30;
		case 9:
			sumDay += 31;
		case 8:
			sumDay += 31;
		case 7:
			sumDay += 30;
		case 6:
			sumDay += 31;
		case 5:
			sumDay += 30;
		case 4:
			sumDay += 31;
		case 3:
			sumDay += 28;
		case 2:
			sumDay += 31;
		case 1:
			sumDay += d;
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		System.out.println("第"+sumDay+"天");
		
	}
}
