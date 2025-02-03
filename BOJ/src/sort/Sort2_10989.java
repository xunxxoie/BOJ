package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort2_10989 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        int[] inputs = new int[10001];

        for(int i = 0; i < size; i++){
            int x = Integer.parseInt(br.readLine());
            inputs[x]++;
        }

        for(int i = 0; i<10001; i++){
            while(inputs[i] > 0){
                sb.append(i).append("\n");
                inputs[i]--;
            }
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}
