package template.dataStructure;

import java.util.ArrayDeque;

/**
 * ArrayDeque를 사용해서 deque, stack을 모두 사용할 수 있음.
 */
public class DequeAndStack {
    public static void main(String[] args) {
        // stack 으로 사용
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.pop();

        // 큐로 사용
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(100);

        System.out.println(deque.getFirst());
        System.out.println(deque.removeFirst());
        
         // 예외 관리
        boolean isSuccess = deque.offerFirst(1);
        Integer canNull = deque.pollFirst();

    }

}
