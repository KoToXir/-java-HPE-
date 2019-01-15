package object.extend.classtest.cylinder;

public class Point {
	protected int x;	//圆心X坐标
	protected int y;	//圆心Y坐标
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//有参构造
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//无参构造
	public Point() {}
	
}
