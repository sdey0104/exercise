import java.util.Stack;

public class StackStart {

//https://leetcode.com/problems/read-n-characters-given-read4/submissions/


    public static void main(String[] arg) {
        MinStack minStack = new MinStack();
        minStack.push(-1);
//        minStack.push(-3);
//        minStack.push(-8);
        System.out.println("Minimum Value "+minStack.getMin());   //--> Returns -3.
       // minStack.pop();
        System.out.println(minStack.top());     // --> Returns 0.
        System.out.println("Minimum Value "+minStack.getMin());

    }

}

class MinStack {
    private static Stack<Integer> STACK = new Stack<>();

    public void push(int x) {
        STACK.push(x);
    }

    public void pop() {
        STACK.pop();
    }

    public int top() {
       return STACK.peek();
    }

    public int getMin() {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < STACK.size(); i++) {
            if (result > STACK.get(i)) {
                result = STACK.get(i);
            }
        }

        return result;
    }
}


