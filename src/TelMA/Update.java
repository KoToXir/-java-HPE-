package TelMA;

import java.util.Scanner;

public class Update {

	public static void update(Person[] AllPersons) {
		// TODO 自动生成的方法存根
		System.out.println("-------------------修改电话本-------------------");
		System.out.println("输入要修改的姓名");
		Scanner scannerUp = new Scanner(System.in);
		String name = scannerUp.next();
		System.out.println("准备修改："+name);
		//关闭输入流主方法会报错
		//scannerUp.close();
	}

}
