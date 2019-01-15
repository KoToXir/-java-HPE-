package PhonoNumberManageSystem;

import java.util.Scanner;
import PhonoNumberManageSystem.Person;

public class Start {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("----------电话本管理系统----------");
		System.out.println("1、添加\t"+"2、删除\t"+"3、修改\t"+"4、查询所有\t"+"5、根据姓名查询\t"+"0、退出\t");
		System.out.println("----------------------------------");
		System.out.println("请选择业务");
		
		//初始化联系人
		//电话本共能存10条记录
		Person[] azPersons = new Person[10];
		Person A = new Person();
		//Person B = new Person();
		A.setName("张三");
		A.setSex("男");
		A.setAge(12);
		A.setTelephone("13333333333");
		A.setQq("10010");
		A.setAddress("北京市海淀区");
		//B.setName("李四");
		azPersons[0] = A;
		//azPersons[1] = B;
		System.out.println("初始：姓名："+azPersons[0].getName()+" 性别："+azPersons[0].getSex()+" 年龄："+azPersons[0].getAge()+" 电话"+azPersons[0].getTelephone()+" QQ："+azPersons[0].getQq()+" 地址："+azPersons[0].getAddress());
		
		//主程序控制
		Scanner scanner = new Scanner(System.in);
		int flag=1;
		while(flag==1) {
			flag = 1;
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:
				Insert.insert(azPersons);
				break;
			case 2:
				Delete.delectByName(azPersons);
				break;
			case 3:
				Update.update(azPersons);
				break;
			case 4:
				Select.selectAll(azPersons);
				break;
			case 5:
				Select.selectByName(azPersons);
				break;
			case 0:
				flag = 0;
				break;
			default:
				flag = 1;
				System.out.println("请重新输入，按0退出系统");
				//System.exit(1);	//强行终止整个程序
				break;
			}
			System.out.println("请选择业务");
			System.out.println("1、添加\t"+"2、删除\t"+"3、修改\t"+"4、查询所有\t"+"5、根据姓名查询\t"+"0、退出\t");
		}
		scanner.close();
		System.out.println("程序关闭");
		
		
	}

}
