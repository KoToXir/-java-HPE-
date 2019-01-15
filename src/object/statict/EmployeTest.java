package object.statict;

public class EmployeTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Employe e1 = new Employe();
		e1.setName("张三");
		e1.setId("10010");
		e1.setAge(30);
		e1.showInfo();
		//调用静态成员方法
		Employe.showCompany();
	}

}
