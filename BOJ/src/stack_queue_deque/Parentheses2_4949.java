package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parentheses2_4949 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String input = br.readLine();

            if(input.equals(".")){
                sb.setLength(sb.length()-1);
                System.out.print(sb);
                break;
            }

            if(isParentheses(input)) {
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
        }

    }

    public static boolean isParentheses(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek().equals('[') )
                    return false;
                stack.pop();
            } else if (ch == '[') {
                stack.push(ch);
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek().equals('('))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
