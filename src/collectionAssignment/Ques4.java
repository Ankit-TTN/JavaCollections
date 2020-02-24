package collectionAssignment;

import java.util.*;

public class Ques4 {
    public static Map<String, Integer> sortByValue(Map<String, Integer> hash)
    {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hash.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> tempMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> l : list) {
            tempMap.put(l.getKey(), l.getValue());
        }
        return tempMap;
    }


    public static void main(String[] args) {
        Map<String,Integer> hash = new HashMap<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int value  = rand.nextInt(1000);
            hash.put("Key"+rand.nextInt(2000),value);
        }


        System.out.println("------------------------------------------");
        System.out.println("Original Values");
        System.out.println("------------------------------------------");

        System.out.println(hash);

        System.out.println("------------------------------------------");
        System.out.println("Sorted Values");
        System.out.println("------------------------------------------");
        hash = sortByValue(hash);
        System.out.println(hash);
    }

}
