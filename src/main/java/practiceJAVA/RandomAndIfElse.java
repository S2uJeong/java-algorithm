package practiceJAVA;

public class RandomAndIfElse {
    public static void main(String[] args) {

        System.out.println("주사위 게임 시작.");
        System.out.println("주사위 굴리는 중....");
        System.out.println('.');
        System.out.println('.');
        System.out.println('.');
        System.out.println('.');

        System.out.print("결과: ");

        int num = (int) (Math.random() * 6) + 1;

        if(num == 1) {
            System.out.printf("%d 입니다! 앞으로 %d 전진하세요.\n", num, num);
        } else if(num == 2) {
            System.out.printf("%d 입니다! 앞으로 %d 전진하세요.\n", num, num);
        } else if(num == 3) {
            System.out.printf("%d 입니다! 앞으로 %d 전진하세요.\n", num, num);
        } else if(num == 4) {
            System.out.printf("%d 입니다! 앞으로 %d 전진하세요.\n", num, num);
        } else if(num == 5) {
            System.out.printf("%d 입니다! 앞으로 %d 전진하세요.\n", num, num);
        } else { // 난수로 나올 수 있는 수는 1~6이기 때문에 6은 else 문으로.
            System.out.printf("%d 입니다! 앞으로 %d 전진하세요.\n", num, num);
        }
    }
}
