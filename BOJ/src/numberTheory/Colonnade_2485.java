package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Colonnade_2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] inputTrees = new int[size];

        for (int i = 0; i < size; i++) {
            inputTrees[i] = Integer.parseInt(br.readLine());
        }

        int minGap = inputTrees[1] - inputTrees[0];

        for (int i = 1; i < size - 1; i++) {
            minGap = getGCD(minGap, inputTrees[i + 1] - inputTrees[i]);
        }

        int totalTrees = (inputTrees[size - 1] - inputTrees[0]) / minGap + 1;

        System.out.print(totalTrees - size);
    }

    public static Integer getGCD(int a, int b){
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a%b);
    }
}
