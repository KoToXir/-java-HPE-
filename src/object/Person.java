package object;

public class Person {
	//成员变量
	private int ID;
	private String nameString;
	private int age;
	private String sex;
	private String gender = "male";
	protected String DNA="xxxxxxxxxxxxx";
	
	public Person(int age,String name) {
		// TODO 自动生成的构造函数存根
		this.age = age;
		this.nameString = name;
	}
	
	//开放的get和set方法
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = 22;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//成员方法

	public String say() {
		// TODO 自动生成的方法存根
		String sthString = "say sth";
		return sthString;
	}
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println(this.age);
	}
	public void addAge(int i) {
		System.out.println("增加后为:"+(this.age+i));
	}


}
