package 프로그래머스.day7;

public class RemoveChar {
    public String solution(String my_string, String letter) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <my_string.length() ; i++) {
            if (my_string.charAt(i) == letter.charAt(0)) {
                continue;
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        String answer = sb.toString();
        return answer;
    }

    public String solution2(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {

        RemoveChar m = new RemoveChar();

        System.out.println(m.solution("BCBdbe" , "B"));

    }


}
