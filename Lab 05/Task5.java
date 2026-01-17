import java.util.Stack;

public class Task5 {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testString1 = "radar";
        String testString2 = "hello";

        System.out.println(testString1 + " is a palindrome: " + isPalindrome(testString1));
        System.out.println(testString2 + " is a palindrome: " + isPalindrome(testString2));
    }
}
