import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    private List<Student> students ;
    private List<Course> courses ;

    public University() {
        students = new ArrayList<>() ;
        courses = new ArrayList<>() ;
        students.add(new Student("Roan Van Quyen" , 18  , "DaiHoc")) ;
        students.add(new Student("Roan Van Chuc" , 43  , "Ra truong")) ;
        students.add(new Student("Bui Thi Hue" , 41  , "Ra truong")) ;
        students.add(new Student("Le Thi Linh" , 18  , "DaiHoc")) ;
        courses.add(new Course("KTMT")) ;
        courses.add(new Course("HDH")) ;
        courses.add(new Course("HDT")) ;
        courses.add(new Course("CTDL")) ;


    }
    Scanner Ip = new Scanner(System.in) ;

    public void getStudents(){
        for(Student x : students){
            x.DisplayInfo();
        }
    }
    public void addStudent(){
        System.out.printf("Name: ");
        String name = Ip.nextLine() ;
        System.out.printf("Age: ");
        int age = Ip.nextInt();
        Ip.nextLine() ;
        System.out.printf("Grade: ");
        String grade = Ip.nextLine() ;
        Student one = new Student(name , age  , grade) ;
        students.add(one) ;
    }

    public void removeStudent(){
        System.out.printf("Remove student by Id: ");
        int id = Ip.nextInt();
        for(int i = 0 ; i < students.size() ; i++){
            if(students.get(i).getId()  == id) {
                students.remove(students.get(i)) ;
                System.out.println("Sucsessed");
                return;
            }
        }
        System.out.println("Failed");
    }


    public void addCourse(){
        Ip.nextLine() ;
        System.out.printf("Name Course: ");
        String name = Ip.nextLine() ;
        Course one = new Course(name) ;
        courses.add(one) ;
    }

    public void getCourse(){
        for(int i = 0 ; i < courses.size() ; i++){
            System.out.printf("%-15d %-50s\n" , courses.get(i).getCourseId()  , courses.get(i).getCourseName());
        }
    }
    public void removeCourse(){
        System.out.printf("Remove course by Id: ");
        int id = Ip.nextInt();
        for(int i = 0 ; i < courses.size() ; i++){
            if(courses.get(i).getCourseId() == id){
                System.out.println("Successed");
                courses.remove(courses.get(i)) ;
                return;
            }
        }
        System.out.println("Failed");
        return;
    }
    public Course findById(int id){
        for(Course x : courses){
            if(x.getCourseId() == id)
                return  x ;
        }
        return  null ;
    }
    public Student findByIdStudent(int id){
        for(Student x : students){
            if(x.getId() == id)
                return  x ;
        }
        return  null;
    }

}
