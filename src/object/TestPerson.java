package object;

import object.Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*Person zhangsan = new Person();
		System.out.println(zhangsan.say());
		zhangsan.setAge(18);
		System.out.println(zhangsan.getAge());
		
		Person lisi = new Person();
		lisi.setNameString("李四");
		lisi.setAge(19);
		lisi.setSex("女");
		lisi.study();
		lisi.showAge();
		lisi.addAge(1);*/
		Person wangwu = new Person(77, "王五");
		System.out.println(wangwu.getAge());
		System.out.println(wangwu.getNameString());
	}

}
