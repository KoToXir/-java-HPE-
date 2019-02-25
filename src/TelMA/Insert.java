package TelMA;

import java.util.Scanner;

import TelMA.Person;

public class Insert {

	public static void insert(Person[] AllPerson ) {
		// TODO 自动生成的方法存根
		System.out.println("添加联系人");
		//搜索插入位置
		int location = 0;
		for(Person i:AllPerson) {
			if(i==null) {
				break;
			}else {
				location += 1;				
			}
		}
		System.out.println("插入位置，第"+(location+1)+"条");
		
		//新建插入对象
		Person newPerson = new Person();	
		Scanner scannerIN = new Scanner(System.in);
		//开始逐字段添加
		//输入姓名
		System.out.println("输入联系人姓名");
		String  name = scannerIN.next();
		newPerson.setName(name);
		//输入性别
		System.out.println("输入联系人性别");
		String  sex = scannerIN.next();
		newPerson.setSex(sex);
		//输入年龄
		System.out.println("输入联系人年龄");
		int  age = scannerIN.nextInt();
		newPerson.setAge(age);
		//输入电话
		System.out.println("输入联系人电话");
		String  phono = scannerIN.next();
		newPerson.setTelephone(phono);
		//输入QQ
		System.out.println("输入联系人QQ");
		String  qq = scannerIN.next();
		newPerson.setQq(qq);
		//输入地址
		System.out.println("输入联系人地址");
		String  address = scannerIN.next();
		newPerson.setAddress(address);
		//这个对象存进数组
		AllPerson[location] = newPerson;
		newPerson = null;
		//关闭输入流主方法会报错
		//scannerIN.close();
	}

}
