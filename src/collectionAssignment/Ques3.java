package collectionAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<Character,Integer> totalOccurrences =  occurrences(str.toCharArray());
        for (Character k : totalOccurrences.keySet()) {
            System.out.println(k+" : " + totalOccurrences.get(k));
        }
    }

    static HashMap occurrences(char[] arr){
        HashMap<Character,Integer> hash = new HashMap<>();
        for (char c : arr) {
            if(hash.containsKey(c)){
                hash.put(c,hash.get(c)+1);
            } else{
                hash.put(c,1);
            }
        }

        return hash;
    }
}
