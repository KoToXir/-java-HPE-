/**
 * 定义一个员工类,自己分析出几个成员，然后给出成员变量和成员方法，构造方法，getXxx()/setXxx()方法，
 * 以及一个显示所有成员信息的方法，并给出一个静态成员变量和一个静态成员方法。最后进行测试验证。
 */
package object.statict;

public class Employe {
	private String name;
	private String id;
	private int age;
	private static String company = "CCB";
	private String task;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Employe.company = company;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	public void showInfo() {
		System.out.println("姓名："+this.name+" id："+this.id+" 年龄："+this.age+" 工作："+this.task);
	}
	//静态方法
	public static void showCompany() {
		System.out.println("公司："+company);
	}
}
