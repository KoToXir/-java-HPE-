package TelMC.view;

import java.util.List;
import java.util.Scanner;

import TelMC.po.TelephoneItem;
import TelMC.service.TelephoneManager;
import TelMC.service.impl.TelephoneManagerImpl;

public class MainUI {
	
	private static TelephoneManager telManger = new TelephoneManagerImpl();

	public static void main(String[] args) {
		//封装到两个方法。
		//UI流程控制
		System.out.println("***********************************");
		System.out.println("***************请选择功能：************");
		System.out.println("****1：新增	2：修改	3：删除	4：查询	5：退出（系统退出后数据将全部清空）");
		System.out.println("***********************************");
		
		//获取用户输入的信息
		Scanner scanner = new Scanner(System.in);
		while(true) {
			//循环体
			String input = scanner.next();
			if(input.equals("5")) {
				break;
			}
			if(input.equals("1")) {
				//新增数据
				add(scanner);
			}
			if(input.equals("2")) {
				//修改
				update(scanner);
			}
			if(input.equals("3")) {
				//删除
			}
			if(input.equals("4")) {
				//查询
				find(scanner);
			}
			System.out.println("请再次选择！1：新增	2：修改	3：删除	4：查询	5：退出（系统退出后数据将全部清空）");
		}
		System.out.println("****系统已退出！****");
		
	}
	
	public static void update(Scanner sc) {
		System.out.println("请输入要修改的用户名：");
		
		//修改前的name值
		String oname = sc.next();
		System.out.println("请输入要做出的修改：");
		
		//修改后的信息
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入性别：1表示男 0表示女");
		int sex = sc.nextInt();
		System.out.println("请输入地址：");
		String addr = sc.next();
		System.out.println("请输入手机号码：");
		String tel = sc.next();
		
		TelephoneItem item = new TelephoneItem();
		item.setAge(age);
		item.setSex(sex);
		item.setAddr(addr);
		item.setTel(tel);
		
		boolean flag  = telManger.updateTel(oname, item);
		if(flag) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改成功");
		}
	}	
	
	public static void find(Scanner sc) {
		System.out.println("****请选择查询类型：1、通过姓名查询；2、查询所有；3、根据姓名和年龄查询;4、退出****");
		String input = sc.next();
		if(input.equals("1")) {
			System.out.println("****请输入查询的用户名：****");
			String name = sc.next();
			List<TelephoneItem> list = telManger.findAll(name);
			for (TelephoneItem tel : list) {
				System.out.println(tel);
			}
		}else if (input.equals("2")) {
			List<TelephoneItem> list = telManger.findAll();
			for (TelephoneItem tel : list) {
				System.out.println(tel);
			}
		}
	}
	
	public static void add(Scanner sc) {
		TelephoneItem item = getTelephoneItem(sc);
		boolean flag = telManger.addTel(item);
		if(flag) {
			System.out.println("添加成功！");
		}else {
			System.out.println("添加失败！");
		}
		
	}
	
	public static TelephoneItem getTelephoneItem(Scanner sc) {
		System.out.println("请输入用户名：");
		String name = sc.next();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入性别：1表示男 0表示女");
		int sex = sc.nextInt();
		System.out.println("请输入地址：");
		String addr = sc.next();
		System.out.println("请输入手机号码：");
		String tel = sc.next();
		
		TelephoneItem item = new TelephoneItem();
		item.setName(name);
		item.setAge(age);
		item.setSex(sex);
		item.setAddr(addr);
		item.setTel(tel);
		
		return item;
		
	}

}
