import java.time.Period;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; // asserthat
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


// how to implementing comparable in custom class
public class Comparing  {


    static class Student implements Comparable <Student>{

        String name;
        int age ;


        public Student(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
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
            Student student = (Student) o;
            return age == student.age &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }


        @Override
        public int compareTo(Student o) {
            int value =0;
            if (this.name.compareTo(o.name) > 0)
            {
                return 1;
            }
            else if (this.name.compareTo(o.name) < 0 ){return -1;}
            else if(this.age>o.age ) {return 1;}
            else if(this.age<o.age ) {return -1;}

            return value;

        }








}
    static void asserter ( int a){
        assert (a>9): "Stopped";
        System.out.println("Didnt stopp");
        Integer c = 8;
        Integer d = 9;
        assertThat(c,is(d));


    }

    // Wrapper classes Integer are immutable

    private static void modify(Integer i)
    {
        i = i + 1;
    }



    public static void main(String[] args) {


        String a = "a";
        String b ="A";
        //asserter(11);

        int compareNumber = a.compareTo(b);
        System.out.println(compareNumber);

        Student p1 = new Student("Hassan", 36);
        Student p2 = new Student("Hassan", 35);
        Student p3 = p1;
        p3.setName("Jamal");
        System.out.println(p1.getName());

        List <Student> listStudent = new ArrayList<>();
        listStudent.add(p1);
        listStudent.add(p2);
        //genericPrinter(listStudent);
        // comparing via equals method
        System.out.println(p1.equals(p2));

        // using comparable interface to compare students
        System.out.println("Comparing p1 with p2 "+p1.compareTo(p2));


        //The parameter i is reference in modify and refers to same object as i in main(),
        // but changes made to i are not reflected in main(), why?
        // primitive types are immutable because pass-by-value m you can only change where they point to not value,
        // if you change the value you only changed where you point to
        int i = 12;
        System.out.println("Integer i before change " + i);
        //modify(i);
        System.out.println("Integer i after change " + i);
        int c=2;
        int g=c;
        c=4;
        System.out.println(g);
        Integer s =2;
        Integer f=4;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);

    }


}
