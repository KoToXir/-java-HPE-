package exception;
/**
 * throwsable 别人调用的时候，检查抛出
 * 检查时异常，需要继承Exception，需要处理异常（throws或try）
 * 运行时异常，继承runtimeException（可以不处理，运行的时候可能抛出）
 * @author mygbo
 *
 */
public class ZeroException extends Exception{
	//或者继承RuntimeException
	
	public ZeroException(String msg) {
		super(msg);
	}

}
