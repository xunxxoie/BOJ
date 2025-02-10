package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SymmetricDifferenceOfSets_1269 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < aSize; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < bSize; i++){
            int input = Integer.parseInt(st.nextToken());

            if(set.contains(input))
                count++;
        }

        System.out.println(aSize+bSize - 2*count);
    }
}
