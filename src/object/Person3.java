package object;

public class Person3 {
	private String nameString;
	private int age;
	private String schoolString;
	private String majorString;
	
	public Person3(String n,int a) {
		this.nameString = n;
		this.age = a;
	}
	public Person3(String n,int a,String s) {
		this.nameString = n;
		this.age = a;
		this.schoolString = s;
	}
	public Person3(String n,int a,String s,String m) {
		this.nameString = n;
		this.age = a;
		this.schoolString = s;
		this.majorString = m;
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
		this.age = age;
	}
	public String getSchoolString() {
		return schoolString;
	}
	public void setSchoolString(String schoolString) {
		this.schoolString = schoolString;
	}
	public String getMajorString() {
		return majorString;
	}
	public void setMajorString(String majorString) {
		this.majorString = majorString;
	}
	
	

}
