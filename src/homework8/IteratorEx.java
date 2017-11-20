package homework8;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		Scanner a = new Scanner(System.in);
		int sum = 0;

		while(true) {
			System.out.print("강수량 : ");
			int b = a.nextInt();
			v.add(b);
			sum = b + sum;
			if(b == 0) break;
			
			
			//Vector에 저장된 값 출력
			for(int i=0; i<v.size(); i++){
				System.out.print(v.get(i) + " ");
			}
			System.out.println();
			System.out.println("평균 값은 "+sum / v.size());
			
		}
	}

}