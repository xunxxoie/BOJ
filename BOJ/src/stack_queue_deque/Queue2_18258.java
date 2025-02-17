package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Queue2_18258 {
    public static ArrayDeque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String option = st.nextToken();

            if(option.equals("push")){
                int input = Integer.parseInt(st.nextToken());

                queue.add(input);
            }else if(option.equals("pop")){
                try{
                    sb.append(queue.remove()).append("\n");
                }catch (NoSuchElementException e){
                    sb.append(-1).append("\n");
                }
            }else if(option.equals("size")) {
                sb.append(queue.size()).append("\n");
            }else if(option.equals("empty")){
                int value = queue.isEmpty() ? 1 : 0;
                sb.append(value).append("\n");
            }else if(option.equals("front")){
                try{
                    sb.append(queue.getFirst()).append("\n");
                }catch (NoSuchElementException e){
                    sb.append(-1).append("\n");
                }
            }else if(option.equals("back")){
                try{
                    sb.append(queue.getLast()).append("\n");
                }catch (NoSuchElementException e){
                    sb.append(-1).append("\n");
                }
            }
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
