package object;

public class TestPerson3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person3 zhangsan = new Person3("张三",11);
		Person3 lisi = new Person3("李四",12,"清华大学");
		Person3 wangwu = new Person3("王五",11,"MIT","量子力学");
		System.out.println(zhangsan.getNameString()+zhangsan.getAge());
		System.out.println(lisi.getNameString()+lisi.getAge()+lisi.getSchoolString());
		System.out.println(wangwu.getNameString()+wangwu.getAge()+wangwu.getSchoolString()+wangwu.getMajorString());
		
	}

}
