package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPrime_4134 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < size; i++){
            long startValue = Long.parseLong(br.readLine());

            while(true){
                if(startValue == 0 || startValue == 1){
                    sb.append(2).append("\n");
                    break;
                }
                if(isPrime(startValue)) {
                    sb.append(startValue).append("\n");
                    break;
                }
                startValue++;
            }
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }

    public static Boolean isPrime(long startValue){
        boolean result = true;

        for(int i = 2; i <= Math.sqrt(startValue); i++){
            if(startValue % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
