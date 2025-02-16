package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DokiDoki_12789 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        List<Integer> sortedList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {

            int value = Integer.parseInt(st.nextToken());
            sortedList.add(value);

            if(stack.isEmpty()){
                stack.add(value);
            }else if(stack.peek() < value) {
                while(!stack.isEmpty() && stack.peek() < value){
                    outputList.add(stack.pop());
                }
                stack.add(value);
            }else if (stack.peek() > value){
                stack.add(value);
            }
        }

        int stackSize = stack.size();
        for(int j = 0; j < stackSize; j++)
            outputList.add(stack.pop());


        Collections.sort(sortedList);

        if(sortedList.equals(outputList)){
            System.out.print("Nice");
        }else{
            System.out.print("Sad");
        }
    }
}
