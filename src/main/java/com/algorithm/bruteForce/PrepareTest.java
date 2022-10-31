package com.algorithm.bruteForce;

public class PrepareTest {
    public int [] solution(int [] answer) {
       /*
            1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
            2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
            3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
        */
        return new int[0];
    }

    // (1) 12345 패턴으로 찍는 학생이 몇 문제를 맞추었는지 알아내는 코드 (5문제일때)
    public int firstStudentanswer() {
        int [] answer = {1,2,3,4,5};
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == i) {
                count++;
            }
        }
        return count;
    }

    // (2) 12345 패턴으로 찍는 학생이 몇 문제를 맞추었는지 알아내는 코드 (여러문제일때)
    public int firstStudent(int [] answers) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == i) {
                count++;
            }
        }
        return count;
    }





    public static void main(String[] args) {
        // 1번 --> 5
        // 3번 --> 0
    }
}
