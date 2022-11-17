package 프로그래머스.사칙연산;

public class Q005 {
    public int solution(int num1, int num2) {
        int answer = (int) ( (float)num1/num2 * 1000 ) ;
        return answer;
    }

    public static void main(String[] args) {
        Q005 m = new Q005();
        System.out.print(m.solution(7,3));

    }
}
