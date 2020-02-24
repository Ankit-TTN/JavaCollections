package collectionAssignment;

import java.util.HashMap;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(uniqueChar(str.toCharArray()));
    }

    static int uniqueChar(char[] arr){
        int uniqueCount = 0;
        HashMap<Character,Integer> hash = new HashMap<>();
        for (char c : arr) {
            if(hash.containsKey(c)){
                hash.put(c,hash.get(c)+1);
            } else{
                hash.put(c,1);
            }
        }

        for (Character k : hash.keySet()) {
            uniqueCount += hash.get(k)==1 ? 1 :0;
        }

        return uniqueCount;
    }
}
