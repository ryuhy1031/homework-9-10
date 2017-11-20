package homework8;

import java.util.*;

public class LocationManager {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("도시 , 경도, 위도를 입력하세요.");
		for (int i=0; i<3; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			String longitude = st.nextToken().trim();
			String latitude = st.nextToken().trim();
			
			Location location = new Location(city, longitude, latitude);
			dept.put(city, location); //해시맵에 저장
		}			
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String city = it.next(); // 이름 알아냄
			Location location = dept.get(city); // 이름을 키로하여 해시맵으로 Student 객체 얻어냄
			System.out.println("---------------------------");
			System.out.println("도시:" + location.getcity());
			System.out.println("경도:" + location.getLongitude());
			System.out.println("위도:" + location.getLatitude());
			System.out.println("---------------------------");
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("도시 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; // 종료
			
			Object city = null;
			Location location = dept.get(city); // 해시맵에서 이름을 키로 검색
			if(location == null) { // 이름이 해시맵에 없다면
				System.out.println(name + " 도시가 없습니다.");
			}
			else { // 해시맵에서 검색된  Location 객체
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
