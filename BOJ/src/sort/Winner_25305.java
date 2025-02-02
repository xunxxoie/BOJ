package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Winner_25305 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int winners = Integer.parseInt(input[1]);

        String[] numbers = br.readLine().split(" ");
        Integer[] scores = Arrays.stream(numbers)
                                 .map(Integer::parseInt)
                                 .toArray(Integer[]::new);

        Arrays.sort(scores, Collections.reverseOrder());

        System.out.print(scores[winners-1]);
    }
}
