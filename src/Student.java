import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Displayable{
    private int age ;
    private String grade ;
    private List<Course> courseOfThisStudent  = new ArrayList<>() ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Student(){}

    public Student(int age, String grade) {
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age, String grade) {
        super(name);
        this.age = age;
        this.grade = grade;
    }

    public void enroll(Course course){
        System.out.println("Success");
        courseOfThisStudent.add(course) ;
        course.getStudents().add(new Student(this.name , this.age  , this.grade)) ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public void DisplayInfo() {
        System.out.println(toString());
        System.out.println("COURSE OF " + "'" + name + "' is: " + courseOfThisStudent.size() );
        for(Course x : courseOfThisStudent){
            System.out.printf("%-15d %-55s\n" , x.getCourseId() , x.getCourseName());
        }
    }
}
