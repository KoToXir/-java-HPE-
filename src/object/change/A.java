/**
 * 查找顺序this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
 */
package object.change;

public class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}
}
