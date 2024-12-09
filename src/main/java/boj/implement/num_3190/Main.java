package boj.implement.num_3190;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int N;
    static int[][] maps;
    static List<Move> moves = new ArrayList<>();
    static int[] dr = {0,1,0,-1};
    static int[] dc = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        maps = new int[N+1][N+1];

        int A = Integer.parseInt(br.readLine());
        for (int i = 0; i < A; i++) {
            String[] apples = br.readLine().split(" ");
            int r = Integer.parseInt(apples[0]);
            int c = Integer.parseInt(apples[1]);
            maps[r][c] = 1;
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String[] moveInfo = br.readLine().split(" ");
            int sec = Integer.parseInt(moveInfo[0]);
            char way = moveInfo[1].charAt(0);
            moves.add(new Move(sec, way));
        }
        System.out.println(solution());
    }
    static class Move {
        int sec;
        char way;

        Move(int sec, char way) {
            this.sec = sec;
            this.way = way;
        }
    }
    public static int turn(int direction, char command) {
        if (command == 'L') {
            return (direction + 3) % 4; // 왼쪽으로 90도 회전
        } else {
            return (direction + 1) % 4; // 오른쪽으로 90도 회전
        }
    }

    public static int solution() {
        Deque<int[]> snake = new LinkedList<>();
        int r = 1, c = 1; // 현재 뱀의 위치
        maps[r][c] = 2;
        snake.add(new int[]{r, c});

        int time = 0; // 시간
        int direction = 0; // 동쪽으로 시작
        int idx = 0; // 이동 커맨드 리스트 idx

        while (true) {
            // 한 턴 마다 해야할 것 : 뱀 위치 옮기기(maps, snake), time 증가, time에 따른 command 확인
            int nr = r + dr[direction], nc = c + dc[direction];
            // 3. time 늘리기
            time += 1;
            // 1. 이동 (벽, 자기몸 충돌 시 안됨)
            if (1 <= nr && nr <= N && 1 <= nc && nc <= N && maps[nr][nc] != 2) {
                // 2. 뱀 변화
                snake.add(new int[]{nr, nc});
                // 2-1. 사과가 아니면 크기가 안 늘어서 뒤를 줄여줌
                if (maps[nr][nc] == 0) {
                    int[] tail = snake.poll();
                    maps[tail[0]][tail[1]] = 0;
                }
                maps[nr][nc] = 2;
                r = nr;
                c = nc;
            } else { // 1-1. 이동불가
                break;
            }
            // 4. command 확인
            if (idx < moves.size() && time == moves.get(idx).sec) { // 해당 초에 회전 커맨드가 있다.
                direction = turn(direction, moves.get(idx).way);
                idx += 1;
            }
        }
        return time;
    }

}
