package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NumberCard_10816 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cardSize = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> cards = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cardSize; i++){
            int card = Integer.parseInt(st.nextToken());
            if (cards.containsKey(card)){
                cards.put(card, cards.get(card) + 1);
            }else{
                cards.put(card, 1);
            }
        }

        int inputSize = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < inputSize; i++){
            int input = Integer.parseInt(st.nextToken());

            Integer output = cards.get(input);

            if(output == null){
                output = 0;
            }

            sb.append(output).append(" ");
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
