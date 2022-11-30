package 프로그래머스.수학_배열;

public class Q015 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double) sum / numbers.length;

        return answer;
    }

    public static void main(String[] args) {
        Q015 m = new Q015();
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(m.solution(arr));
    }
}
