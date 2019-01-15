package object.extend.classtest.cylinder;

public class Cylinder extends Circle{
	protected int h;	//圆柱体高

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	//有参构造
	public Cylinder(int x,int y,int r,int h) {
		super(x,y,r);
		this.h = h;
	}
	//无参构造
	public Cylinder() {}
	
	//输出圆柱体体积
	public double volume() {
		return this.square()*h;
	}
}
