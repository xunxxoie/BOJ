package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowClosing_13909 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 1; i*i <= size; i++){
            count++;
        }
        System.out.print(count);
    }
}
