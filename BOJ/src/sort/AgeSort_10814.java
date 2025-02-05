package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AgeSort_10814 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        List<Person> inputs = new ArrayList<>();

        StringTokenizer st;
        for(int i = 0; i < size; i++){
            st = new StringTokenizer(br.readLine());

            Integer age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            inputs.add(new Person(age, name));
        }

        inputs.sort((p1, p2) -> {
            if (Objects.equals(p1.age, p2.age)) {
                return 0;
            } else {
                return p1.age - p2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Person person : inputs){
            sb.append(person.age).append(" ").append(person.name).append("\n");
        }

        sb.setLength(sb.length() - 1);

        System.out.print(sb);

    }

    public static class Person{
        Integer age;
        String name;

        public Person(Integer age, String name){
            this.age = age;
            this.name = name;
        }
    }
}
