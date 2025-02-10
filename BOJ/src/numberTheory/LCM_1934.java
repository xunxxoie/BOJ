package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < size; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = getGCD(a,b);

            sb.append((a * b) / gcd).append("\n");
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }

    public static Integer getGCD(int a, int b){
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a%b);
    }
}
