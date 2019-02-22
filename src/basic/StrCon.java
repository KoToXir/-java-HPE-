/**
 * 测试String.concat()方法拼接字符串
 */
package basic;



public class StrCon {
	
	public static void main(String args[]) {
		String a = "abc";
		String b = "def";
		String c = "ghi";
		System.out.println(a.concat(b.concat(c)));
		
		String str = "Hello World";
		String[] ns = str.split(" ");
		if(ns[0].equals(ns[1])) {
			System.out.println("分割后前后相等");
		}
		System.out.println(ns[1]);
		
	}
}
