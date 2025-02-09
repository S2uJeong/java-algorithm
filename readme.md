- 📁 algorithm
  - 24.06 ~ 
  - 파이썬으로 문제 풀면서 java로도 풀이 중

- 📁 com/algorithm
  - 멋쟁이 사자처럼 백엔드 스쿨
  - 알고리즘 시간 풀이

- 📁 프로그래머스
  - 1일 1알고리즘 풀기 (22.11.17~ end)

- 📁 algorithmLecture
  - 강의 보며 문제풀이

- 📁 practiceJAVA
  - 자바 개념에 대해 탐구

---

## 알고리즘 note
### 입출력
```java
// 입력
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine()); // br.readLine 할 때마다 새로운 객체 생성 

// 출력
StringBuilder sb = new StringBuilder();
```

### 자료구조
- 이중리스트는 ArrayList를 쓰자 
  - 선언 : `List<List<Integer> = new ArrayList();`
  - 삽입 : `graph.get(node1).add(node2)` == `graph[node1].append[node2]`
- java의 deque
  - `Deque<Integer> dQ = new ArrayDeque<>();` : 큐와 스택 모두의 기능 제공, 가변 크기 배열, 대부분의 연산 상수 시간, 스레드 비안전
  ```
    추가 메서드:
    addFirst(E e): 지정된 요소를 덱의 앞에 추가합니다.
    addLast(E e): 지정된 요소를 덱의 뒤에 추가합니다.
    offerFirst(E e): 지정된 요소를 덱의 앞에 추가하고, 성공 여부를 반환합니다.
    offerLast(E e): 지정된 요소를 덱의 뒤에 추가하고, 성공 여부를 반환합니다.
  
    제거 메서드:
    removeFirst(): 덱의 앞에서 요소를 제거하고 반환합니다.
    removeLast(): 덱의 뒤에서 요소를 제거하고 반환합니다.
    pollFirst(): 덱의 앞에서 요소를 제거하고 반환하며, 덱이 비어 있으면 null을 반환합니다.
    pollLast(): 덱의 뒤에서 요소를 제거하고 반환하며, 덱이 비어 있으면 null을 반환합니다.
  
    조회 메서드:
    getFirst(): 덱의 앞에 있는 요소를 반환합니다.
    getLast(): 덱의 뒤에 있는 요소를 반환합니다.
    peekFirst(): 덱의 앞에 있는 요소를 반환하며, 덱이 비어 있으면 null을 반환합니다.
    peekLast(): 덱의 뒤에 있는 요소를 반환하며, 덱이 비어 있으면 null을 반환합니다.
  ```
- Array 초기화 : `Arrays.fill(tmpArray, '초기화값');`
- 
### 숫자함수
- max
  - 배열 (Array)에서 가장 큰 값 찾기 : `Arrays.stream(tmpArray).max().getAsInt();`