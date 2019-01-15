package object.interfacets;

public class TestInterface {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CompareableCircle c1 = new CompareableCircle();
		CompareableCircle c2 = new CompareableCircle();
		c1.setRadius(1);
		c2.setRadius(2);
		int a = c1.compareTo(c2);
		//System.out.println(a);
	}

}
