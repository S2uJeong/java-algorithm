package practiceJAVA;

public class SwitchExpressions {
    public static void main(String[] args) {

        char grade = 'c';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            case 'C', 'c' -> {
                System.out.println("휴면 회원입니다.");
            }
        }

/*        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("휴면 회원입니다.");
        }*/

    }
}
