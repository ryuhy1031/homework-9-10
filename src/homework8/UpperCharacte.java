package homework8;

import java.io.*;

public class UpperCharacte {

	public static void main(String[] args) {//try�� ����Ѵ�.
		try {
			File f = new File("c:\\windows\\system.ini");
			FileReader fin = new FileReader(f);
			int c;
			int count = 1; // count ���
			System.out.print(count++ + "       ");
			while((c=fin.read()) != -1) {//while ������ �̿�
				char a = (char)c;
				if(Character.isLowerCase(a))
					a = Character.toUpperCase(a);
				System.out.print((char)a);
			}
			fin.close();
		}
		catch(IOException e) {//catch ���
			System.out.println("���� �б� ����");
		}

	}

}
