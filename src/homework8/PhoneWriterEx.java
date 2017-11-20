package homework8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneWriterEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			
			}
			fout.close();
			
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();

	
	}
}