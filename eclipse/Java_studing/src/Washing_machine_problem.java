import java.util.Scanner;

public class Washing_machine_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세탁기의 초기상태 Byte를 입력하세요 (0~127) : ");
        int status = sc.nextInt();
        System.out.println("세탁기 입력 상태 : " + Integer.toBinaryString(status));

        for (int i = 0; i < STATUS_MESSAGES.length; i++) {
            System.out.println(STATUS_MESSAGES[i] + " = " + checkStatusBit(status, i));
        }
        
        System.out.println("수도가 연결되었는지 = "+(((status >>1) & 0b00000001)==1));
    }
    
    
    private static boolean checkStatusBit(int status, int position) {
        int verificationVariable = 0b00000001;
        return (((status >> position) & verificationVariable) == 1);
    }
    
    private static final String[] STATUS_MESSAGES = {
            "전기가 연결되었는지", 
            "수도가 연결되었는지",
            "문이 닫혀있는지",
            "빨래가 들어있는지",
            "빨래가 너무 많이 들어있지는 않는지",
            "배수관이 막혀있는지",
            "빨래가 한쪽에 치우쳐 있는지"
    };

}


