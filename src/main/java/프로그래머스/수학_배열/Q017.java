package 프로그래머스.수학_배열;


public class Q017 {
    public int[] solution(int money) {
        int[] answer = {(money/5500), (money%5500)};
        return answer;
    }
}
