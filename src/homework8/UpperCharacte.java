package homework8;

import java.io.*;

public class UpperCharacte {

	public static void main(String[] args) {//try를 사용한다.
		try {
			File f = new File("c:\\windows\\system.ini");
			FileReader fin = new FileReader(f);
			int c;
			int count = 1; // count 사용
			System.out.print(count++ + "       ");
			while((c=fin.read()) != -1) {//while 구문을 이용
				char a = (char)c;
				if(Character.isLowerCase(a))
					a = Character.toUpperCase(a);
				System.out.print((char)a);
			}
			fin.close();
		}
		catch(IOException e) {//catch 사용
			System.out.println("파일 읽기 오류");
		}

	}

}
