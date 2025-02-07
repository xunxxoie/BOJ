package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LeeDahSom_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int dictionarySize = Integer.parseInt(st.nextToken());
        int problemSize = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> dictionaryByName = new HashMap<>();
        HashMap<Integer, String> dictionaryById = new HashMap<>();

        for(int i = 1; i <= dictionarySize; i++){
            String name = br.readLine();
            dictionaryByName.put(name, i);
            dictionaryById.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < problemSize; i++){
            String name = br.readLine();

            if(dictionaryByName.containsKey(name)){
                sb.append(dictionaryByName.get(name)).append("\n");
            }else{
                sb.append(dictionaryById.get(Integer.parseInt(name))).append("\n");
            }
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
