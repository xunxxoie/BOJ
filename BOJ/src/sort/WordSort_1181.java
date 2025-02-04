package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class WordSort_1181 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        TreeSet<String> inputs = new TreeSet<>((s1, s2) -> {
            if(s1.length() != s2.length()){
                return s1.length() - s2.length();
            }else{
                return s1.compareTo(s2);
            }
        });

        for(int i = 0; i < size; i++)
            inputs.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(String output : inputs){
            sb.append(output).append("\n");
        }

        sb.setLength(sb.length()-1);

        System.out.print(sb);

    }
}
