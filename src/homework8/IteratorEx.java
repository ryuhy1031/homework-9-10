package homework8;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		Scanner a = new Scanner(System.in);
		int sum = 0;

		while(true) {
			System.out.print("������ : ");
			int b = a.nextInt();
			v.add(b);
			sum = b + sum;
			if(b == 0) break;
			
			
			//Vector�� ����� �� ���
			for(int i=0; i<v.size(); i++){
				System.out.print(v.get(i) + " ");
			}
			System.out.println();
			System.out.println("��� ���� "+sum / v.size());
			
		}
	}

}