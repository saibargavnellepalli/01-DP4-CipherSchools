package Week1.Stackss;

public class MinStack {


        int[] stack;
        int[] minStack;
        int top;
        private final static int DEFAULT_STACK_SIZE = 30000;

        public MinStack() {
            stack = new int[DEFAULT_STACK_SIZE];
            minStack = new int[DEFAULT_STACK_SIZE];
            top =0;
        }

        public void push(int val) {
            stack[top] = val;
            if(top == 0)
            {
                minStack[top] = val;
            }
            else if(val < minStack[top-1]){
                minStack[top] = val;
            }
            else{
                minStack[top] = minStack[top-1];
            }
            top++;
        }

        public void pop() {
            top--;
        }

        public int top() {
            return stack[top-1];
        }

        public int getMin() {
            return minStack[top-1];
        }
    }

