package object.interfacets;

public class CompareableCircle extends Circle implements CompareObject {

	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		if (super.getRadius()>((Circle)o).getRadius()) {
			System.out.println("当前对象大");
			return 1;
		}else if (super.getRadius()==((Circle)o).getRadius()) {
			System.out.println("两个对象相等");
			return 0;
		}else {
			System.out.println("被比较的大");
			return -1;
		}
	}

}
