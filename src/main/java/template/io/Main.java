package template.io;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int l = Integer.valueOf(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        logic();

        bw.write("Hello");  // String, char 만 출력가능
        bw.flush();
        bw.close();
        br.close();

    }

    static void logic() {
        System.out.println("logic");
    }
}
