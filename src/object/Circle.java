package object;

public class Circle {
	private int banjing;

	public int getBanjing() {
		return banjing;
	}

	public void setBanjing(int banjing) {
		this.banjing = banjing;
	}
	
	public double square() {
		return Math.PI*this.banjing*this.banjing;
	}
}
