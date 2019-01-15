package class_practice;

import java.util.Scanner;

public class Switch_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请选择：1、登陆系统，2、退出");
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		
		switch (a1) {
		case 1:
			System.out.println("登陆成功，请选择功能：");
			System.out.println("1、读者信息管理");
			System.out.println("2、图书信息管理");
			System.out.println("3、借阅管理");
			System.out.println("4、注销");
			//进入下一级
			int a2 = scanner.nextInt();
			switch (a2) {
			case 1:
				System.out.println("已进入读者信息管理功能模块");
				break;
			case 2:
				System.out.println("已进入借阅管理功能模块");
				break;
			case 3:
				System.out.println("已注销");
				break;
			case 4:
				System.out.println("已进入图书信息管理功能模块");
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		scanner.close();
		
	}

}
