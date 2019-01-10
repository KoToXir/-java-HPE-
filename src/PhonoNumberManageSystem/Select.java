package PhonoNumberManageSystem;

import java.util.Scanner;
import PhonoNumberManageSystem.Person;

public class Select {
	
	public static void selectAll(Person[] AllPerson) {
		// TODO 自动生成的方法存根
		System.out.println("-----------------查询当前所有联系人：----------------------");
		for(Person i:AllPerson) {
			if(i!=null) {
				System.out.print(" 姓名："+i.getName());
				System.out.print(" 性别："+i.getSex());
				System.out.print(" 年龄："+i.getAge());
				System.out.print(" 电话："+i.getTelephone());
				System.out.print(" QQ："+i.getQq());
				System.out.print(" 地址："+i.getAddress());
				//换行
				System.out.println();
			}
		}
	}
	
	//根据姓名查找
	public static void selectByName(Person[] AllPerson) {
		// TODO 自动生成的方法存根
		System.out.println("-----------------根据姓名查找联系人联系人：----------------------");
		Scanner scannerBN = new Scanner(System.in);
		//输入待查姓名
		String name = scannerBN.next();
		for(Person i:AllPerson) {
			if(i!=null) {
				if(i.getName().equals(name)) {
					System.out.print(" 姓名："+i.getName());
					System.out.print(" 性别："+i.getSex());
					System.out.print(" 年龄："+i.getAge());
					System.out.print(" 电话："+i.getTelephone());
					System.out.print(" QQ："+i.getQq());
					System.out.print(" 地址："+i.getAddress());
					//换行
					System.out.println();
				}
			}
		}
		//关闭输入流主方法会报错
		//scannerBN.close();
	}
}
