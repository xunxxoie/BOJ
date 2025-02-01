package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SimpleSort_2750 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        int[] inputs = new int[size];

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < size; i++)
            set.add(Integer.parseInt(br.readLine()));

        for(int i : set)
            sb.append(i).append("\n");

        sb.setLength(sb.length()-1);

        System.out.print(sb);
    }
}