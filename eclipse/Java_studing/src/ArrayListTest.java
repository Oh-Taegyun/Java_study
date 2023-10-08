import java.util.*;

public class ArrayListTest {
	public static void main(String[] args)
	{
		ArrayList <String> list1 = new ArrayList<>();
		ArrayList <String> list2 = new ArrayList<>();
		ArrayList <String> list3 = new ArrayList<>();
		list1.add("철수");
		list1.add("영희");
		list1.add("순신");
		list1.add("자영");
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("이름을 입력하세요 : ");
			String input = sc.nextLine();
			if(input.equals("0")) break;
			else {
				list2.add(input);
			}
		}
		System.out.println("List" + list1 + " ");

		System.out.println("List" + list2 + " ");
		
		for(String item1 : list1) {
            if(!list2.contains(item1)) {
                list3.add(item1);
            }
        }
		
		System.out.println("(List-List2)" + list3 + " ");
		
	}
}
