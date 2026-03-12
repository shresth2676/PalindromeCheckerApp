public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam Im Adam";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] chars = normalized.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}