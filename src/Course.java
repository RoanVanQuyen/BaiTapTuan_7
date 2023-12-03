import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course implements Displayable{
    private int courseId ;
    private static int ID ;
    private String courseName ;
    private List<Student> students ;

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Course(){
        students = new ArrayList<>() ;
    }
    public Course( String courseName) {
        students = new ArrayList<>() ;
        courseId = ID ;
        ID++ ;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    @Override
    public void DisplayInfo() {
        System.out.println(toString());
        for(Student x : students){
            System.out.printf("%-15s %-32s %-15d %-15s" , x.getId() , x.getName() , x.getAge() , x.getGrade() );
        }
    }
}
