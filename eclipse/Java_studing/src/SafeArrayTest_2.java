import java.util.Scanner;

public class SafeArrayTest_2 {
	public static void main(String args[]) {
		SafeArray array = new SafeArray(4);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < (array.length); i++) {
			int k = sc.nextInt();
			array.put(i,k);
		}
		
		for (int i = 0; i < (array.length) ; i++) {
			System.out.println("array.get(i) = " + array.get(i));
		}
		
		System.out.println("index length = " + array.getIndex());
		}
}
