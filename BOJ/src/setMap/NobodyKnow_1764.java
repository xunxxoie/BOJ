package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NobodyKnow_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int noHearSize = Integer.parseInt(st.nextToken());
        int noSeenSize = Integer.parseInt(st.nextToken());

        HashSet<String> people = new HashSet<>();
        for (int i = 0; i < noHearSize; i++) {
            people.add(br.readLine());
        }

        TreeSet<String> names = new TreeSet<>();
        for (int i = 0; i < noSeenSize; i++) {
            String name = br.readLine();
            if (people.contains(name)) {
                names.add(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(names.size()).append("\n");

        for (String name : names) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}
