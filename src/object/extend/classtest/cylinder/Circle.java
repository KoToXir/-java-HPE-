package object.extend.classtest.cylinder;

public class Circle extends Point{
	protected int r;	//圆柱体底面半径

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	//有参构造
	public Circle(int x,int y,int r) {
		super(x,y);
		this.r = r;
	}
	//无参构造
	public Circle() {} 
	
	//输出面积
	public double square() {
		return Math.PI*r*r;
	}
}
