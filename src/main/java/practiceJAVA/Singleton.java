package practiceJAVA;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    /**
     * getInstance 메서드 또한 static 이여야 하는 이유?
     * -> static 영역에서 힙 영역을 참조할 수 없다' 는 자바 문법 사항 때문 {static:heap} = {1:N}
     * -> 인스턴스가 private 접근제어자를 가지므로 static 영역에 있는 인스턴스에 접근하기 위해 메서드도 static 영역에 있어야 참조 가능
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
