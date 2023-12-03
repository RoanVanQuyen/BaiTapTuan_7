// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner Ip = new Scanner(System.in) ;
    static University university = new University() ;
    public static void choice_7(){
        university.getCourse();
        System.out.printf("ID of course: ");
        int id = Ip.nextInt() ;
        System.out.printf("ID of student: ");
        id = Ip.nextInt() ;
        Student student = university.findByIdStudent(id) ;
        Course course = university.findById(id) ;
        if(student != null && course != null) {
            student.enroll(course);
            System.out.println("Success");
        }
        else{
            System.out.println("Erorr");
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Display Students");
            System.out.println("2. Display Courses");
            System.out.println("3. Add Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Add Course");
            System.out.println("6. Remove Course");
            System.out.println("7. Enroll Student in Course");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Ip.nextInt();
            if(choice == 1) university.getStudents();
            if(choice == 2) university.getCourse();
            if(choice == 3) university.addStudent();
            if(choice == 4) university.removeStudent();
            if(choice == 5) university.addCourse();
            if(choice == 6) university.removeCourse();
            if(choice == 7) choice_7();
        } while (choice != 0);
    }
}