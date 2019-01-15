/**
 * 定义一个学生类（Student）,分析出需要的属性以及行为，要求，有一个属性是静态，有一个行为是静态的，并进行测试验证。
 */
package object.statict;

public class Student {
	private String name;
	private String id;
	private int age;
	private static String task0 = "STUDY";
	private String task1;
	
	
	public static String getTask0() {
		return task0;
	}
	public static void setTask0(String task0) {
		Student.task0 = task0;
	}
	public String getTask1() {
		return task1;
	}
	public void setTask1(String task1) {
		this.task1 = task1;
	}
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

	
	public static void showTask() {
		System.out.println(task0);
	}

}
