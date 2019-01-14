package object.extend.classtest.student;

public class Person {
	//属性
	private String name;
	private int age;
	private String sex;
	//单个取值和赋值
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	//有参构造
	public Person(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	//无参显式声明
	public Person(){}
	
	public void showinfo() {
		System.out.print(this.name+" "+this.age+" "+this.sex);
	}
}
