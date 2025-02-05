package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CoordinateCompression_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] originalArray = new int[size];
        int[] sortedArray = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < size; i++) {
            originalArray[i] = Integer.parseInt(st.nextToken());
            sortedArray[i] = originalArray[i];
        }

        Arrays.sort(sortedArray);

        HashMap<Integer, Integer> rankingMap = new HashMap<>();
        int rank = 0;

        for(int value : sortedArray) {
            if(!rankingMap.containsKey(value)) {
                rankingMap.put(value, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            sb.append(rankingMap.get(originalArray[i])).append(' ');
        }

        System.out.println(sb);
    }
}