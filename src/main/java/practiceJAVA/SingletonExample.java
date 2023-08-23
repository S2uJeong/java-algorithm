package practiceJAVA;

public class SingletonExample {
    public static void main(String[] args) {


        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Singleton singleton = new Singleton();  [컴파일 에러]

        /**
         * 동일한 객체인지 확인
         */
        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 객체입니다.");
        } else {
            System.out.println("obj1과 obj2는 다른 객체입니다.");
        }
    }

}
