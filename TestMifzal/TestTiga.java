package TestMifzal;

import java.util.Scanner;
import java.util.*;
import java.util.Stack;

public class TestTiga {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input1 = "{[()]}";
        // String input2 = "{[(])}";
        // String input3 = "{(([])[])[]}";

        System.out.print("Masukan Inputan 1: ");
        String input1 = scanner.nextLine();
        System.out.println("Input:" + input1);
        System.out.println("Output: " + isBalanced(input1));
        System.out.println();

        System.out.print("Masukan Inputan 2: ");
        String input2 = scanner.nextLine();
        System.out.println("Input: " + input2);
        System.out.println("Output: " + isBalanced(input2));
        System.out.println();

        System.out.print("Masukan Inputan 3: ");
        String input3 = scanner.nextLine();
        System.out.println("Input: " + input3);
        System.out.println("Output: " + isBalanced(input3));
    }
}
