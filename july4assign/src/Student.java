public class Student {
    String name;
    char grade;
    String course;

    public Student(String name, char grade, String course) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }
    void addCourse(){
        System.out.println(course+"course is added");
    }
    void dropCourse(){
        System.out.println(course+"course is drop");
    }
}
