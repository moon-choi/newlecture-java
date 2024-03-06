package part3.ex6.인터페이스;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/part3/ex6/인터페이스/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		scan.close();
		fis.close();
		
		A a = new A(); //A.class.newInstance() == new A();
//		B b = new B();
		Class clazz = Class.forName(className); //클래스 정보 얻어옴. 
		X x = (X) clazz.newInstance(); //얻어온 클래스정보로 인스턴스 만듦. 
//		a.setX(b);
		a.setX(x);

		a.print();
		
		//결합력이 낮아짐. A가 B없이도 처리가 가능해짐.
	}

}
