package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class StringSets_11478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        HashSet<String> stringSet = new HashSet<>();

        for(int sliceLength = 0; sliceLength < input.length(); sliceLength++){
            int startIndex = 0;
            int endIndex = startIndex + sliceLength;

            while(endIndex < input.length()){
                String slice = input.substring(startIndex, endIndex + 1);

                stringSet.add(slice);

                startIndex++;
                endIndex++;
            }
        }

        System.out.print(stringSet.size());
    }
}
