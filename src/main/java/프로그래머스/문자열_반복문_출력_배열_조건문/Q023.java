package 프로그래머스.문자열_반복문_출력_배열_조건문;

public class Q023 {
    /**
     * 평균 75MB, 0.03ms
     */
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        String answer = String.valueOf(sb);
        return answer;
    }
    /**
     * solution2 방법은 코드는 간결해 보이는데,,,
     * 이거 String으로 하면 메모리 커지는거 아닌가?? 맞다 -> 평균 76MB, 12ms
     * String에서 연산자가 무슨 의미인지 찾아보자.
     */
    public String solution2(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String my_string = "hello";
        int n = 3;

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
                // charAt(i) 일때랑 charAt(j) 일떄랑 다른 거 비교하면서 이중for문 공부하기
            }
        }

        System.out.println(sb); // sb가 String 처럼 출력이 되네
    }
}
