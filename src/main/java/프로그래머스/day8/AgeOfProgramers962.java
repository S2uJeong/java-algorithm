package 프로그래머스.day8;

public class AgeOfProgramers962 {
    
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageStr = Integer.toString(age);
        for (int i = 0; i < ageStr.length(); i++) {
            sb.append((char) (ageStr.charAt(i) + 49));
        }

        return sb.toString();
    }

    public String solution2(int age) {
        String answer = "";
        char [] alpha = {'a','b','c','d','e','f','g','h','i','j'};

        while (age >= 1) {
            answer = alpha[age%10] + "" + answer;
            age /= 10;
        }
        return answer;

    }
    
    public static void main(String[] args) {
        int age = 23;
        StringBuilder sb = new StringBuilder();
        String ageStr = Integer.toString(age);

        System.out.println(ageStr);
        for (int i = 0; i < ageStr.length(); i++) {
            sb.append((char) (ageStr.charAt(i) + 49));
        }
        System.out.println(sb);

        // solution2 Test
        AgeOfProgramers962 m = new AgeOfProgramers962();
        System.out.println(m.solution2(23));

    }

}
