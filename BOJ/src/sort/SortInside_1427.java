package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInside_1427 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Integer[] numbers = new Integer[input.length()];

        for(int i = 0; i < input.length(); i++){
            numbers[i] = input.charAt(i) - '0';
        }

        Arrays.sort(numbers, Collections.reverseOrder());
        for(int i : numbers){
            System.out.print(i);
        }

    }
}