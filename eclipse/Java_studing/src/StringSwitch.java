import java.util.Scanner;

public class StringSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피자 종류를 입력하시오: ");
		String model = sc.next();
		int price=0;
		switch (model) {
			case "콤비네이션":
				price = 20000;
				System.out.println("피자 "+model+"의 가격 = "+price);
				break;
			case "슈퍼슈프림": 
				price = 20000; 
				System.out.println("피자 "+model+"의 가격 = "+price);
				break;
			case "포테이토": 
				price = 15000; 
				System.out.println("피자 "+model+"의 가격 = "+price);
				break;
			case "쉬림프": 
				price = 25000; 
				System.out.println("피자 "+model+"의 가격 = "+price);
				break;
			default: 
				System.out.println(model + " 피자는 없습니다."); 
				break;
		}
		sc.close();
	}
}

