package collectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        ArrayList<Float> floatList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            floatList.add(in.nextFloat());
        }

        Iterator<Float> it = floatList.iterator();
        float sum = 0;
        while(it.hasNext()){
            sum += it.next();
        }

        System.out.println("Sum : "+sum);
    }
}
