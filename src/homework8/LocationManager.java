package homework8;

import java.util.*;

public class LocationManager {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("���� , �浵, ������ �Է��ϼ���.");
		for (int i=0; i<3; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			String longitude = st.nextToken().trim();
			String latitude = st.nextToken().trim();
			
			Location location = new Location(city, longitude, latitude);
			dept.put(city, location); //�ؽøʿ� ����
		}			
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String city = it.next(); // �̸� �˾Ƴ�
			Location location = dept.get(city); // �̸��� Ű���Ͽ� �ؽø����� Student ��ü ��
			System.out.println("---------------------------");
			System.out.println("����:" + location.getcity());
			System.out.println("�浵:" + location.getLongitude());
			System.out.println("����:" + location.getLatitude());
			System.out.println("---------------------------");
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("���� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; // ����
			
			Object city = null;
			Location location = dept.get(city); // �ؽøʿ��� �̸��� Ű�� �˻�
			if(location == null) { // �̸��� �ؽøʿ� ���ٸ�
				System.out.println(name + " ���ð� �����ϴ�.");
			}
			else { // �ؽøʿ��� �˻���  Location ��ü
				System.out.print(location.getcity() + ", ");
				System.out.print(location.getLongitude() + ", ");
				System.out.print(location.getLatitude() + ", ");
			}
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	public static void main (String[] args) {
		LocationManager man = new LocationManager();
		man.run();
	}
}
