package practiceJAVA;

/**
 * 생성자 오버로딩을 통해 코드 중복이 많아지는 경우를 제어 가능한 기능
 * this
 */


public class ThisOfConstructor {
    public static void main(String[] args) {

        Car newCar1 = new Car("red");
        System.out.println(newCar1.maxSpeed);

    }
}
