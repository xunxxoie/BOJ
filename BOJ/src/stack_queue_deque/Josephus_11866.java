package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus_11866 {

    public static Queue<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        int size = Integer.parseInt(st.nextToken());
        int flag = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= size; i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){

            for(int i = 0; i<flag-1; i++){
                queue.offer(queue.poll());
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.setLength(sb.length()-2);
        sb.append(">");
        System.out.print(sb);
    }
}
