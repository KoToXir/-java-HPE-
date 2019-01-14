package object.extend;

public class ManKind {
	private int sex;
	private int salary;
	
	
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//显示性别，1为男，0为女
	public void manOrWorman(){
		if(this.sex==1) {
			System.out.println("man");
		}else {
			System.out.println("woman");
		}
	}
	//0没工作，1有工作
	public void emplyeed() {
		if(this.salary==0) {
			System.out.println("no job");
		}else {
			System.out.println("job");
		}
	}

}
