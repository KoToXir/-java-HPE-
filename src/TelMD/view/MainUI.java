package TelMD.view;

import java.util.List;
import java.util.Scanner;

import TelMD.po.TelephoneItem;
import TelMD.service.TelephoneManager;
import TelMD.service.impl.TelephoneDbImpl;

public class MainUI {
	
	//private static TelephoneManager telManager = new TelephoneManagerImpl();
	private static TelephoneManager telManager = new TelephoneDbImpl();
	
	
	public static void main(String[] args) {
		// UI流程控制。
		System.out.println("*************************************************************");
		System.out.println("****欢迎来到小象的通信录，请输入编号进入：******************************");
		System.out.println("****1：新增；2：修改；3：删除；4：查询；5退出（系统退出，数据清空！）********");
		System.out.println("*************************************************************");
		
		// 获取用户输入的信息
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 循环体
			String input = sc.next();
			if(input.equals("5")) {
				break;
			}
			if(input.equals("1")) {
				// 新增数据
				add(sc);
			}
			if(input.equals("2")) {
				// 修改
				update(sc);
			}
			if(input.equals("3")) {
				// 删除
			}
			if(input.equals("4")) {
				// 查询
				find(sc);
			}
			System.out.println("****请再次选择：1：新增；2：修改；3：删除；4：查询；5退出（系统退出，数据清空！）********");
		}
		System.out.println("****谢谢惠顾，下次再来！*******************************************");
	}

	public static void update(Scanner sc) {
		System.out.println("请输入要修改的对象的用户名：");

		// 修改前的name值
		String name = sc.next();
		System.out.println("请录入要修改的修改：");
		
		// 修改后的 信息
		System.out.println("请输入性别：1 表示男  0表示女");
		int sex = sc.nextInt();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入地址：");
		String addr = sc.next();
		System.out.println("请输入手机号码：");
		String tel = sc.next();
		
		TelephoneItem item = new TelephoneItem();
		item.setAddr(addr);
		item.setAge(age);
		item.setName(name);
		item.setSex(sex);
		item.setTel(tel);
		
		
		boolean falg = telManager.updateTel(name, item);
		if(falg) {
			System.out.println("修改成功！");
		}else {
			System.out.println("修改失败！");
		}
		
	}
	
	public static void find(Scanner sc) {
		System.out.println("****请再次查询类型：1：通过姓名查询；2：查询所有；3：根据姓名和年龄查询；4、退出当前查询********");
		String input = sc.next();
		if(input.equals("1")) {
			System.out.println("****请输入查询的用户名：");
			String name = sc.next();
			List<TelephoneItem> list = telManager.findAll(name);
			for (TelephoneItem tel : list) {
				System.out.println(tel);
			}
		}
		
		if(input.equals("2")) {
			List<TelephoneItem> list = telManager.findAll();
			for (TelephoneItem tel : list) {
				System.out.println(tel);
			}
		}
		
	}
	
	public static void add(Scanner sc) {
		
		TelephoneItem item = getTelephoneItem(sc);
		boolean flag = telManager.addTel(item);
		if(flag) {
			System.out.println("添加成功！");			
		}else {
			System.out.println("添加失败！");
			//add(sc);
		}
	}
	
	public static TelephoneItem getTelephoneItem(Scanner sc) {
		
		System.out.println("请输入用户名：");
		String name = sc.next();
		System.out.println("请输入性别：1 表示男  0表示女");
		int sex = sc.nextInt();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入地址：");
		String addr = sc.next();
		System.out.println("请输入手机号码：");
		String tel = sc.next();
		
		TelephoneItem item = new TelephoneItem();
		item.setAddr(addr);
		item.setAge(age);
		item.setName(name);
		item.setSex(sex);
		item.setTel(tel);
		
		return item;
	}
		
}
