package collectionAssignment;
import java.util.*;

class Student {
    String name;
    Double score;
    Double age;

    public Student(Double age, Double score, String name) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", score=" + score + ", age=" + age + '}';
    }
}

public class Ques6 {
    public static void main(String[] args) {
        List<Student> studList = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            studList.add(new Student(
                    (double) rand.nextInt(30) + 20,
                    (double) 20,
                    ""+(char)(65+i))
            );
        }

        for (Student student : studList) {
            System.out.println(student);
        }

        Collections.sort(studList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int ret = 0;
                ret = o1.score > o2.score ? 1 : -1;
                if(o1.score.equals(o2.score)){
                    ret = o1.name.compareTo(o2.name);
                }
                return ret;
            }
        });

        System.out.println("-------------------------------------------");
        System.out.println("Sorted");
        System.out.println("-------------------------------------------");

        for (Student student : studList) {
            System.out.println(student);
        }

    }
}
