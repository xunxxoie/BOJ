package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero_10773 {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 0; i < size; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                sum -= stack.pop();
            }else{
                stack.add(input);
                sum += input;
            }
        }

        System.out.print(sum);
    }
}
