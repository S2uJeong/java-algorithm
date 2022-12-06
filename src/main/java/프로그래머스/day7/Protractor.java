package 프로그래머스.day7;

public class Protractor {
    public int solution(int angle) {
        int answer;

        if ( angle < 90 ) {
            answer = 1;
        } else if ( angle == 90) {
            answer = 2;
        } else if ( 90 < angle && angle < 180 ) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }
}
