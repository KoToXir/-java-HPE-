package object.interfacets.test4;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Employee e1 = new Employee(56);
		Employee e2 = new Employee(23, "张三","男",20);
		System.out.println(e1.getName()+e1.getAge()+e1.getSex()+e1.getID()+e1.getCompany()+e1.getSalary());
		System.out.println(e2.getName()+e2.getAge()+e2.getSex()+e2.getID()+e2.getCompany()+e2.getSalary());
		e1.play();
		e1.sing();
	}
	

}
