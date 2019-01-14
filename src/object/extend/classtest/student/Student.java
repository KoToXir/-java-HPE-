package object.extend.classtest.student;

public class Student extends Person{

	private String id;
	
	
	public Student(String name, int age, String sex,String id) {
		super(name, age, sex);
		// TODO 自动生成的构造函数存根
		this.id = id;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	public void showinfo() {
		super.showinfo();
		System.out.println(" "+id);
	}
	
}
