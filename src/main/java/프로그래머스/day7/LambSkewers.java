package 프로그래머스.day7;

public class LambSkewers {
    public int solution(int n, int k) {
        int lambCost = n * 12000;
        int cokeCost = 2000 * (k - n/10);
        int answer = lambCost + cokeCost;
        return answer;
    }
}
