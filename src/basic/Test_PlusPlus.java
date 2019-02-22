package basic;

public class Test_PlusPlus {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int k=0;
		int t=k++ + ++k + k + k++ ;
		//k++本身为0，运算这步后变为1
		//++k本身为1，运算这步前变为2
		//k++本身为2，运算这步后变为3
		//t=0+2+2+2
		System.out.println(t);
	}

}
