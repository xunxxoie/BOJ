package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBachPartition_17103 {

    public static Boolean[] primeArray = new Boolean[1000001];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<1000001; i++){
            primeArray[i] = isPrime(i);
        }

        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < size; i++){
            int input = Integer.parseInt(br.readLine());

            int count = 0;
            for(int j = 2; j <= input/2; j++){
                if(primeArray[j] && primeArray[input-j])
                    count++;
            }

            sb.append(count).append("\n");
        }

        sb.setLength(sb.length() -1);
        System.out.print(sb);
    }

    public static Boolean isPrime(long input){

        if (input < 2)
            return false;

        if (input == 2)
            return true;

        if (input % 2 == 0)
            return false;

        for(int i = 2; i <= Math.sqrt(input); i++){
            if(input % i == 0)
                return false;
        }

        return true;
    }
}
