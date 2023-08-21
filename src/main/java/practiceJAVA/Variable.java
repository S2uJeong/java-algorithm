package practiceJAVA;

/**
 * 연산 산술식에서의 자동 형 변환 확인
 */
public class Variable {
    public static void main(String[] args) {

        int intValue = 10;
        long longValue = 20;
        long result = intValue + longValue;
        // int result = intValue + longValue; ---> 에러
        int result_2 = intValue + (int)longValue; // 강제 형변환을 활용한 제어

        System.out.println(result);
        System.out.println(result_2);


    }
}
