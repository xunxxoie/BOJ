package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Card2_2164 {
    public static ArrayDeque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        for(int i = 1; i <= size; i++)
            deque.add(i);

        while(true){

            if(deque.size() == 1){
                System.out.print(deque.remove());
                break;
            }

            deque.remove();
            deque.add(deque.poll());

        }

    }
}
