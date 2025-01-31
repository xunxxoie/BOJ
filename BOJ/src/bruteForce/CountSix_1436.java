package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSix_1436 {
    private static final String DOOM_NUMBER = "666";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int count = 0;
        int i = 0;

        while (true) {
            if (containsTripleSix(i)) {
                count++;
            }

            if (count == input) {
                System.out.println(i);
                break;
            }

            i++;
        }
    }

    private static boolean containsTripleSix(int number) {
        return String.valueOf(number).contains(DOOM_NUMBER);
    }
}