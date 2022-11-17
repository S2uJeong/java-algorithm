package algorithmLecture.string;

import java.util.Scanner;

// 대소문자 구분하지 않는다. -> 대/소문자 중 하나로 통일시킨다.
public class FindChar {
    public int solution(String strInput, char target) {
        int answer = 0;
        strInput = strInput.toUpperCase();
        target = Character.toUpperCase(target);

        for (int i = 0; i < strInput.length(); i++) {
            if (strInput.charAt(i) == target ) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindChar m = new FindChar();
        Scanner sc = new Scanner(System.in);
        String strInput = sc.next();
        char target = sc.next().charAt(0);
        System.out.print( m.solution(strInput,target) );
    }
}
