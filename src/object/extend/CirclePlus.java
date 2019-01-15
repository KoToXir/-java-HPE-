package object.extend;

import object.Circle;

public class CirclePlus extends Circle{
	private int hight;

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public CirclePlus(int banjing,int hight) {
		// TODO 自动生成的构造函数存根
		super(banjing);
		this.hight = hight;
	}
	
	public double cemianji(){
		return 2*this.getBanjing()*Math.PI*hight;
	}
	
	
}
