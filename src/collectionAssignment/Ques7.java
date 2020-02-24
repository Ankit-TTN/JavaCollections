package collectionAssignment;

import java.util.*;

public class Ques7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        Map<String, Integer> totalOccurrences = occurrences(str);
        for (String k : totalOccurrences.keySet()) {
            System.out.println(k + " : " + totalOccurrences.get(k));
        }
    }

    static Map occurrences(String[] arr) {
        Map<String, Integer> hash = new LinkedHashMap<>();
        for (String c : arr) {
            if (hash.containsKey(c)) {
                hash.put(c, hash.get(c) + 1);
            } else {
                hash.put(c, 1);
            }
        }
        hash = sortByValue(hash);
        return hash;
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> hash) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hash.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int ret = -1;
                if(o2.getValue() > o1.getValue()) {
                    ret = 1;
                }
                else if(o2.getValue()==o1.getValue()){
                    return 0;
                }
                return ret;
            }
        });

        Map<String, Integer> tempMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> l : list) {
            tempMap.put(l.getKey(), l.getValue());
        }
        return tempMap;
    }

}
