package object.extend.classtest.animal;

public class Animal1 extends Animal0{
	private String eat;
	private String move;
	
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	public Animal1(String eat,String move) {
		this.eat = eat;
		this.move = move;
	}
	
	public void showEM() {
		System.out.print(" "+eat+" "+move);
	}
}
