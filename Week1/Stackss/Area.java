package Week1.Stackss;

import java.util.Stack;

public class Area {
    public static void main(String[] args) {
        int arr[] = {2,3,4};
        int a = largestRectangleArea(arr);
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int curr = heights[stack.pop()] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
                res = Math.max(res, curr);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int curr = heights[stack.pop()] * (stack.isEmpty() ? heights.length : (heights.length - stack.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }
}