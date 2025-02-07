package setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WhoInCompany_7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputSize = Integer.parseInt(br.readLine());

        HashMap<String, String> workers = new HashMap<>();
        for(int i = 0; i < inputSize; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String inWork = st.nextToken();

            if(workers.containsKey(name)){
                workers.replace(name, inWork);
            }else{
                workers.put(name, inWork);
            }
        }

        List<String> inWorks = new ArrayList<>();
        for(Map.Entry<String, String> worker : workers.entrySet()){
            if(worker.getValue().equals("enter"))
                inWorks.add(worker.getKey());
        }

        inWorks.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String worker : inWorks){
            sb.append(worker).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}
