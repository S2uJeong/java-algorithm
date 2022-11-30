package 프로그래머스.수학_배열;

public class Q014 {
    public int solution(int slice, int n) {
        int answer = 0;

        while (true) {
            if( (slice * answer)/n >= 1) {
                break;
            } else answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int slice = 7;
        int n = 10;
        int answer = 0;

        while (true) {
            if( (slice * answer)/n >= 1) {
                break;
            } else answer++;
        }
        System.out.println(answer);
    }
}
