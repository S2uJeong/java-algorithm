package practiceJAVA;

public class CopyOfArray {
    public static void main(String[] args) {

        int [] arrInt = {1,2,3,4,5};
        String [] arrStr = {"최수정","차수림","윤원빈","허진주"};

        int [] arrIntCopired = new int[5]; // 복사 대상보다 같거나 크게 공간 설정
        String [] arrStrCopierd = new String[5];

        /**
         * basic : for문
         */
        for(int i=0; i<arrInt.length; i++){
             arrIntCopired[i] = arrInt[i];
        }

        System.out.print("basic copy result: ");
        printInt(arrIntCopired);

        /**
         * arraycopy 메서드 활용
         */
        System.arraycopy(arrStr, 0, arrStrCopierd, 0, arrStr.length);

        System.out.print("arraycopy method result: ");
        printStr(arrStrCopierd);

        /**
         * for each문 활용
         */
        int sum = 0;
        for (int a : arrInt) {
           sum += a;
        }
        System.out.printf("for-each문 sum 구하기: %d \n", sum);

    }

    public static void printInt(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void printStr(String [] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
