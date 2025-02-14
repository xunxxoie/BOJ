package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack2_28278 {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());


        for(int i = 0; i < size; i++){
            st = new StringTokenizer(br.readLine());
            int option  = Integer.parseInt(st.nextToken());

            if (option == 1){
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (option == 2){
                if(!stack.empty()){
                    sb.append(stack.pop()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            } else if (option == 3) {
                sb.append(stack.size()).append("\n");
            } else if (option == 4) {
                if(stack.empty()) {
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            } else if (option == 5) {
                if (!stack.empty()){
                    sb.append(stack.peek()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else{
                continue;
            }
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
