package object.abstracted;

public abstract class Employee {
	private String name;
	private String id;
	private String salary;
	
	public Employee(String n,String i,String s) {
		this.name = n;
		this.id = i;
		this.salary = s;
	}
	
	public abstract void work();
}
