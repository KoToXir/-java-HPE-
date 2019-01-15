package object.finalt;
//定义一个final属性，用构造方法给属性赋值（会报错）
public class Hasky extends Dog {
	final int age = 20;
	public Hasky(int ag) {
		this.age = ag;
	}
}
