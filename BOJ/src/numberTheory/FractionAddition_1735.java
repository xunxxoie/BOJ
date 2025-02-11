package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FractionAddition_1735 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int o1 = a1 * b2 + a2 * b1;
        int o2 = a2 * b2;

        int gcd = getGCD(o1, o2);

        StringBuilder sb = new StringBuilder();

        sb.append(o1 / gcd).append(" ").append(o2 / gcd);

        System.out.print(sb);

    }

    public static Integer getGCD(int a, int b){
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a%b);
    }
}
