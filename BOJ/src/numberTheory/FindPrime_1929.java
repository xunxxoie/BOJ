package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrime_1929 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        for(long i = start; i <= end; i++){
            if(i == 1)
                continue;

            if(i == 2 || i == 3){
                sb.append(i).append("\n");
                continue;
            }

            if(isPrime(i))
                sb.append(i).append("\n");
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
