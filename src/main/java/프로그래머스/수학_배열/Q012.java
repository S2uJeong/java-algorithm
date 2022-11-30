package 프로그래머스.수학_배열;

public class Q012 {
    public int solution(int n) {
        int answer = (n/7) + 1;
        if ( (n % 7) == 0) answer = (n/7);
        return answer;
    }

    public static void main(String[] args) {


    }
}
