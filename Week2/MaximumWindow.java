package Week2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumWindow {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5, 6, 9};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length, ind = 0;
        int[] ans = new int[n - k + 1];

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            if (!q.isEmpty() && q.peek() == i - k)
                q.poll();
            while (!q.isEmpty() && arr[q.peekLast()] <= arr[i]) {
                q.pollLast();
            }
            q.offer(i);

            if (i >= k - 1) {
                ans[ind++] = arr[q.peek()];
            }
        }

        return ans;
    }
}
