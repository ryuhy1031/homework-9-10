package homework8;
import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� >>");
		for(int i=0; i<6; i++) {
			String s = scanner.next();
			a.add(s);
		}
		double sum = 0;
		for(int i=0; i<a.size(); i++) {
			//System.out.println(a.get(i));
			if(a.get(i).equals("A")) {
				sum += 4.0;
			}
			else if(a.get(i).equals("B")) {
				sum += 3.0;
			}
			else if(a.get(i).equals("C")){
				sum += 2.0;
			}
			else if(a.get(i).equals("D")) {
				sum += 1.0;
			}
			else if(a.get(i).equals("F")) {
				sum += 0.0;
			}
			
		}
		
			System.out.println("������ �����  : " + sum / 6);
		scanner.close();
	}

}
