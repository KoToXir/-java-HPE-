package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class CheckException {
	
	
	public void fileWriter() {
		//记录信息到文件中
		//io类的调用
		//信息--》脑袋--》内存--》file文件中
		//Scanner（System.in）；
		//file（）；参照物为内存，从外界往内存中是输入流，内存往外是输出流
		Scanner scanner = new Scanner(System.in);
		String pwd = scanner.next();
		
		//file
		File file = new File("d:/a.txt");
		//输出流
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			out.write(pwd.getBytes());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("文件不存在，检查文件路径");
		}catch (IOException e1) {
			// TODO: handle exception
			e1.printStackTrace();
			System.out.println("写入异常");
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CheckException c = new CheckException();
		c.fileWriter();
	}

}
