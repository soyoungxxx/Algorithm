import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//        Arrays.sort(arr);
//
//        버블 정렬
//        for (int i = 1; i < N; i++) {
//            for (int j = 0; j < N - i; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }

        qsort(arr, 0, arr.length - 1);

        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void qsort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && arr[left] <= arr[pivot]) left++;
            while (right > start && arr[right] >= arr[pivot]) right--;

            int tmp = arr[right];

            if (left > right) {
                arr[right] = arr[pivot];
                arr[pivot] = tmp;
            } else {
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }

        qsort(arr, start, right - 1);
        qsort(arr, right + 1, end);
    }
}