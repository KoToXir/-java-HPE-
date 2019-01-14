package object.extend.classtest.cylinder;

public class TestCylinder {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Cylinder c1 = new Cylinder();
		c1.setX(1);
		c1.setY(1);
		c1.setR(2);
		c1.setH(3);
		System.out.println("X:"+c1.getX()+",Y:"+c1.getY());
		System.out.println("半径："+c1.getR()+" 高："+c1.getH());
		System.out.println("面积："+c1.square());
		System.out.println("体积："+c1.volume());
		
		Cylinder c2 = new Cylinder(3, 4, 5, 6);
		System.out.println("X:"+c2.getX()+",Y:"+c2.getY());
		System.out.println("半径："+c2.getR()+" 高："+c2.getH());
		System.out.println("面积："+c2.square());
		System.out.println("体积："+c2.volume());
	}

}
