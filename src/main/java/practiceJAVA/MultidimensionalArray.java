package practiceJAVA;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // 배열 생성
        int[][] scores = {
                {90,90,96},
                {80,81}
        };

        // 배열의 길이
        System.out.printf("1차원 배열의 길이는 %d입니다.\n", scores.length); // 2
        System.out.printf("2차원 배열의 첫번째 길이는 %d입니다.\n", scores[0].length); // 3

        // 특정 원소 출력
        System.out.printf("첫번째 반의 두번째 학생의 점수는: %d입니다. \n", scores[0][1]);

        // 활용1. 평균 구하기
        int averageScore = 0;
        int sum = 0;
        int count = 0;
        for (int i=0; i<scores.length; i++) {
            for(int j=0; j < scores[i].length; j++) {
                sum += scores[i][j];
                count += 1;
            }
        }
        System.out.printf("총 평균은 %f점 입니다.\n", sum/(double)count);

    }

}
