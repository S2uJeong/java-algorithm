package com.algorithm.quickSort;

// 배열을 나눈다.
public class Partition {

    // 배열 요소값을 서로 바꾼다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열을 나눈다.
    static void partition(int[] a, int n) {
        int pl = 0; // 왼쪽커서
        int pr = n-1; // 오른쪽커서
        int x = a[n/2]; // 피벗, 가운데 값

        do {
            while (a[pl] < x) pl++; // pl에 있어서 pivot보다 작은 값은 고려 대상이 아니다.
            while (a[pr] > x) pr--; // pr에 있어서 pivot보다 큰 값은 고려 대상이 아니다.
            if (pl <= pr)
                swap(a, pl++, pr--); // 1회전 : 스왑이 필요한 pl과 pr에서 멈추고 (while문)
                                    //         if문에서 swap하되, 교차를 예방해서 pl이 pr보다 작거나 같을때로 조건한다.
        } while (pl <= pr);
    }


}
