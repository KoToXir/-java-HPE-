package object.interfacets.test4;

public abstract class Role {
	private String name;
	private int age;
	private String sex;
	
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
	
	public Role() {};
	public Role(String name,int age,String sex) {
		this();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public abstract void play();;
	public void say() {
		System.out.println("这是一个普通方法");
	}
	public final void sing() {
		System.out.println("调用了不能被重写的sing方法");
	}
}
