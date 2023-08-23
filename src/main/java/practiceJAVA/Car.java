package practiceJAVA;

public class Car {
    String company = "ferrari";
    String color;
    int maxSpeed;

    // this 의 기반이 될 공통부분이 많은 생성자. 🔴 this 사용 시, 이 공통 생성자의 매개변수 순서를 지켜야함.
    Car(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car(String color) {
        // 공통 생성자 호출
        this(color, 100000);
    }
    Car(int maxSpeed) {
        // 공통 생성자 호출
        this("red", maxSpeed);
        // this(maxSpeed, "red") [x] -> 공통생성자와 매개변수 순서가 다름.
    }
}