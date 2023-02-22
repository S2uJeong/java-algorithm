package algorithmLecture.greedy;
// https://velog.io/@sj9802/%EC%9D%B4.%EC%BD%94.%ED%85%8C-2.-%EA%B7%B8%EB%A6%AC%EB%94%94-%EA%B5%AC%ED%98%84

public class UntilOne {
    public int solution(int n, int k) {
        int cnt = 0;
        while( n > 1 ) {
            if ( n % k == 0) n /= k;
            else n -= k;

            cnt++;
        }
        return cnt;
    }

    public int solution2(int n, int k) {
        int result = 0;

        while(true) {
            // n이 k로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n/k) * k;
            result += (n - target);
            n = target;
            // n이 k보다 작을 때 (나눌수없을 때)반복문 탈출
            if (n<k) break;
            // k로 나누기
            result += 1;
            n /= k;
        }
        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n-1);

        return result;
    }
    public static void main(String[] args) {
        UntilOne m = new UntilOne();
        System.out.println(m.solution(25,5));
    }
}
