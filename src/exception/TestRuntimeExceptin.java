package exception;

public class TestRuntimeExceptin {
	
	public void test1() {
		int i = 14;
		int a = 0;
		int x = 0;
		try {
			x = i / a;
		} catch (ArithmeticException e) {
			// 逻辑体重具体要做什么
			e.printStackTrace();//打印到控制台，把获取到的错误信息记录到日志
		}
		System.out.println("除的结果："+ x);
	}
	
	public void test2() throws ZeroException{
		int i = 12,a = 0, x = 0;

		if(a == 0) {
			throw new ZeroException("a的值为0,出现除数为0");
		}
		x = i / a;
	}

	public static void main(String[] args) {
		TestRuntimeExceptin test = new TestRuntimeExceptin();
		test.test1();
		//事务中不能内部消化异常
		System.out.println("OVER!");

		try {
			test.test2();
		} catch (ZeroException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
