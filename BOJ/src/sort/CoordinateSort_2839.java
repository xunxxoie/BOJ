package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoordinateSort_2839 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int[][] input = new int[size][2];

        StringTokenizer st; // 공백을 기준으로 문자열을 토큰화 -> 음수처리가능!
        for(int i = 0; i < size; i++){

            st = new StringTokenizer(br.readLine());

            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input, (i1, i2) -> {
            if(i1[0] == i2[0]){
                return i1[1] - i2[1];
            }else{
                return i1[0] - i2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++)
            sb.append(input[i][0]).append(" ").append(input[i][1]).append("\n");

        sb.setLength(sb.length() - 1);

        System.out.print(sb);
    }
}
