package object.interfacets.test4;

public class Employee extends Role {
	private final int ID;
	private static String company;
	private String salary;
	

	public static String getCompany() {
		return company;
	}


	public static void setCompany(String company) {
		Employee.company = company;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public int getID() {
		return ID;
	}

	public Employee(int id) {
		super();
		this.ID = id;
	}
	public Employee(int age,String name,String sex,int id) {
		super(name,age,sex);
		this.ID = id;
	}

	@Override
	public void play() {
		// TODO 自动生成的方法存根
		System.out.print("play方法重写→");
		this.say();
	}

}
