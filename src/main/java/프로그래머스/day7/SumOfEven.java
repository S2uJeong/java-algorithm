package 프로그래머스.day7;

public class SumOfEven {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
