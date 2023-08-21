package practiceJAVA;
import java.util.Scanner;

/**
 * 자바는 기본타입 값 비교는  ==으로,
 * 객체 비교는 .equals로 한다. String은 객체다.
 */
public class InputData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("q를 입력하면 입력이 멈춥니다");

        while(true) {
            System.out.print("입력: ");
            String data = sc.nextLine();
            if (data.equals("q")) {
                System.out.println("종료를 선택하셨습니다. 감사합니다.");
                break;
            }
            System.out.println("출력: " + data);
        }
    }
}
