package PhonoNumberManageSystem;

import java.util.Scanner;
import PhonoNumberManageSystem.Person;

public class Delete {

	public static void delectByName(Person[] AllPersons) {
		// TODO 自动生成的方法存根
		System.out.println("-------------------准备删除-----------------------");
		Select.selectAll(AllPersons);
		System.out.println("请输入要删除的联系人姓名：");
		Scanner scannerDe = new Scanner(System.in);
		String name = scannerDe.next();
		//不能用foreach，foreach的i为临时变量，修改后不影响原数组
		for(int i=0;i<AllPersons.length;i++) {
			if(AllPersons[i]!=null) {
				if(AllPersons[i].getName().equals(name)) {
					AllPersons[i] = null;
					break;
				}
			}
			
		}
		System.out.println("删除完毕");
		Select.selectAll(AllPersons);
		//关闭输入流主方法会报错
		//scannerDe.close();
	}

}
