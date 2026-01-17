import java.util.Stack;

public class Q4 {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        stack = reverseStack1(stack);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);

    }
    // Function to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> stack) {
        // Base case: if the stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element of the stack
        int top = stack.pop();

        // Recursively reverse the remaining stack
        reverseStack(stack);

        // Insert the top element at the bottom of the stack
        insertAtBottom(stack, top);
    }

    // Helper function to insert an element at the bottom of the stack
    private static void insertAtBottom(Stack<Integer> stack, int element) {
        // Base case: if the stack is empty, insert the element
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Recursively insert the element at the bottom
        insertAtBottom(stack, element);

        // Push the top element back onto the stack
        stack.push(top);
    }

    public static Stack<Integer> reverseStack1(Stack<Integer> stack){
        Stack<Integer> s2= new Stack<>();
        stackHelper(stack,s2);
        return s2;

    }
static void stackHelper(Stack<Integer> first,Stack<Integer> second){
        if(first.isEmpty()){
            return;
        }
        second.push(first.pop());
        stackHelper(first, second);
    }
}
