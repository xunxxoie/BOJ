package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class StringSet_14425 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int setSize = Integer.parseInt(st.nextToken());
        int inputSize = Integer.parseInt(st.nextToken());

        HashSet<String> set  = new HashSet<>();
        for(int i = 0; i < setSize; i++)
            set.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < inputSize; i++){
            if(set.contains(br.readLine()))
                count++;
        }

        System.out.print(count);
    }
}
