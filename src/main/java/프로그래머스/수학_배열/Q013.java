package 프로그래머스.수학_배열;

public class Q013 {

    public int solution(int n) {
        int answer = 0;

        while (true) {
            if( (6 * answer)/n >= 1 && (6 * answer) % n == 0 ) {
                break;
            } else answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = 0; // 피자 갯수

        while (true) {
            if( (6*result)/n >= 1 && (6*result) % n == 0 ) {
                break;
            } else result++;
        }

        System.out.println(result);
    }
}
