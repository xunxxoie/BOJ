package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VertAndKongJun_4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            long n = Long.parseLong(br.readLine());

            if(n == 0)
                break;

            int count = 0;

            for(long i = n+1; i <= 2*n; i++){
                if(i == 1)
                    continue;

                if(i == 2 || i == 3){
                    count++;
                    continue;
                }

                if(isPrime(i))
                    count++;
            }

            sb.append(count).append("\n");
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
