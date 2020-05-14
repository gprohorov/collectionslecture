package pro.edu;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student ivan = new Student("Ivan", LocalDate.of(2001, Month.JANUARY, 11), 75 );
        Student stepan = new Student("Stephan", LocalDate.of(1997, 4, 12), 60 );
        Student nataly = new Student("Nataly", LocalDate.of(2002, 5, 19), 95 );

        List<Student> students = new ArrayList<>();

        students.add(ivan);
        students.add(stepan);
        students.add(nataly);


     for (Student student: students){
         System.out.println(student.getName());
     }

  //   List<int> marks = new ArrayList<>();


     int sum = 0;
        for (Student student: students){
            sum +=  student.getMark();
        }
        System.out.println(sum);

        int sum2 = students.stream().mapToInt(Student::getMark).sum();

        int count = (int) students.stream().mapToInt(Student::getMark).count();
        double avg = students.stream().mapToInt(Student::getMark).average().orElse(0);



        System.out.println(sum2);







    }
}
