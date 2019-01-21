package sets.hma;

import java.util.Date;

public class Person {
	private String name;	/* 年龄*/
	private int id;		
	private int age;
	private String sex;
	private String credate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCredate() {
		return credate;
	}
	public void setCredate(String credate) {
		this.credate = credate;
	}
	
	public Person(String n,String s,int i,int a,String d) {
		// TODO 自动生成的构造函数存根
		this.name = n;
		this.sex = s;
		this.age = a;
		this.id = i;
		this.credate = d;
	}

}
