import java.util.*;

public class PalindromeCheckerApp {

    static boolean arrayMethod(String input) {
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    static boolean dequeMethod(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean result1 = arrayMethod(input);
        endTime = System.nanoTime();
        System.out.println("Array Method: " + result1 + " Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean result2 = stackMethod(input);
        endTime = System.nanoTime();
        System.out.println("Stack Method: " + result2 + " Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean result3 = dequeMethod(input);
        endTime = System.nanoTime();
        System.out.println("Deque Method: " + result3 + " Time: " + (endTime - startTime) + " ns");
    }
}