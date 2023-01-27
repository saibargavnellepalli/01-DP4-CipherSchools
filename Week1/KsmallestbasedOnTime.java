package Week1;

import java.util.Arrays;

public class KsmallestbasedOnTime {
    public static void main(String[] args) {
        int arr[] = {200,500,100,70,50};
        int k = 3;
        ksort(arr,k,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void ksort(int[] arr, int k, int n) {
        for (int i=k;i<n;i++) {

            int max = -1;
            int maxInd = -1;
            for (int j = 0; j < k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxInd = j;
                }
            }

            if (maxInd == -1) continue;

            if (arr[i] < max) {
                int x = maxInd;
                while (x < k-1) {
                    arr[x] = arr[x + 1];
                    x++;
                }
                arr[k-1] = arr[i];
            }
        }
    }
}
