import java.util.Scanner;

public class Washing_machine_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세탁기의 초기상태 Byte를 입력하세요 (0~127) : ");
        int status_int = sc.nextInt();
        System.out.println("세탁기 입력 상태 : " + status_int);
        print_status(status_int);
    }

    public static void print_status(int status) {
        int Verification_Variables = 0b00000001; // 비교할 비트
        System.out.println("전기가 연결되었는지 = " + ((status & Verification_Variables) == 1));
        System.out.println("수도가 연결되었는지 = " + ((status >> 1 & Verification_Variables) == 1));
        System.out.println("문이 닫혀있는지 = " + ((status >> 2 & Verification_Variables) == 1));
        System.out.println("빨래가 들어있는지 = " + ((status >> 3 & Verification_Variables) == 1));
        System.out.println("빨래가 너무 많이 들어있지는 않는지 = " + ((status >> 4 & Verification_Variables) == 1));
        System.out.println("배수관이 막혀있는지 = " + ((status >> 5 & Verification_Variables) == 1));
        System.out.println("빨래가 한쪽에 치우쳐 있는지 = " + ((status >> 6 & Verification_Variables) == 1));
    }
}