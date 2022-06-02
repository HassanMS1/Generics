
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

// comparable class using a generic method to search
public class GenericsExample {


    // fetching and printing the elements
    static  int returnMaxIndex (List a)
    {
        // taking a raw list
        // are you going to print string eller another type , problem!
        // lets try to print by casting
       int max=0;
        String s;
        String s2;
        for(int i=1; i<a.size(); i++)
        {
            int compare=0;
            s=(String) a.get(i-1);
            s2=(String) a.get(i);  // trying to cast unknown object type to string, can cause exception
            if(s2.compareTo(s)>0){
                max=i;
            }

        }
        return max;

    }


    static   <T extends Comparable<T>>  int findMaxValueIndex (List <T> a)
    {
        // taking a raw list
        // are you going to print string eller another type , problem!
        // lets try to print by casting
        int max=0;
        //String s;
        //String s2;
        for(int i=1; i<a.size(); i++)
        {
           // s= a.get(i-1);
            //s2= a.get(i);  // trying to cast unknown object type to string, can cause exception
            //System.out.println("i is " +i + " .And result is " +a.get(i).compareTo(a.get(0)) );
            if(a.get(1).compareTo(a.get(0)) >0){

                max=8;
            }

        }
        return max;

    }


    static class Student2 implements Comparable <GenericsExample.Student2>{

        String name;
        int age ;


        public Student2(String name, int age) {
            this.name = name;
            this.age = age;

        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student2 student = (Student2) o;
            return age == student.age &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }




        // checking if the caller object is bigger, smaller or same compared to input object
        @Override
        public int compareTo(Student2 o) {
            if (this.name.compareTo(o.name) > 0)
            {
                return 1;
            }
            else if (this.name.compareTo(o.name) < 0 ){return -1;}
            return 0;
        }
    }







    public static void main(String[] args) {



        // why not to use raw collection list (no type)
        List rawList = new ArrayList(); // this rawList has no type given, all objects can been added
        rawList.add("abc");
        rawList.add(32); // this will create to problems when fetching or comparing, sorting elements because they are different

        //int maxIndex= returnMaxIndex(rawList);

        // using generic method to search and loop unkown type of list -> "List <T>"
        ArrayList <String >typeSecure = new ArrayList<>();
        typeSecure.add("Hassan");
        typeSecure.add("Jah");
        typeSecure.add("Qzdsa");
        typeSecure.add("Qaasa");
        List <Integer >typeSecure2 = new ArrayList<>();
        typeSecure2.add(19);
        typeSecure2.add(99323);
        typeSecure2.add(1928);

        Student2 obj = new Student2("AA", 35);
        Student2 obj2 = new Student2("11", 35);
        List <Student2> students = new ArrayList<>();
        students.add(obj);
        students.add(obj2);



        System.out.println("Max Student name " + findMaxValueIndex(students));
        //System.out.println(students.get(1).compareTo(students.get(0)));
        //System.out.println(findMaxValueIndex(typeSecure));
       // System.out.println(students.get(0));
    }
}



