package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NumberCard_10815 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberSize = Integer.parseInt(br.readLine());

        HashSet<Integer> inputs = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numberSize; i++)
            inputs.add(Integer.parseInt(st.nextToken()));

        int inputSize = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<inputSize; i++)
            sb.append(Boolean.compare(true,inputs.add(Integer.parseInt(st.nextToken())))).append(" ");

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
