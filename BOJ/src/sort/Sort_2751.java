package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_2751 {

    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        List<Integer> inputs = new ArrayList<>();

        for(int i = 0; i < size; i++)
            inputs.add(Integer.parseInt(br.readLine()));

        Collections.sort(inputs);

        for(int i : inputs)
            sb.append(i).append("\n");

        sb.setLength(sb.length() - 1);

        System.out.print(sb);
    }
}
