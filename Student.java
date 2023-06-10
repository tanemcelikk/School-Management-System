import java.util.Scanner;
public abstract class Student extends Person{
    private static final int MAX_COURSES = 50; //We will need ArrayIndexOutOfBoundsException
    private int id;
    private String name;
    private String surname;
    private String studentId;
    private int year;
    private String[] coursesTaken;
    private int[] grades;
    private int gpa;
    private String graduateCertificate;

    private int numCourses = 0;
    private int numGrade = 0;

    // Extra attributes
    private String advisor;

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getYear() {
        return year;
    }

    public String[] getCoursesTaken() {
        return coursesTaken;
    }
    public void setCoursesTaken(String course){
        coursesTaken[numCourses] = course;
        numCourses++;
    }

    public void setGrades(){
        for(int i = 0; i<coursesTaken.length && coursesTaken[i]!=null; i++){
            System.out.printf("%s: ", coursesTaken[i]);
            Scanner scanner = new Scanner(System.in);
            int note = Integer.parseInt(scanner.nextLine()) ;
            grades[i] = note;

        }
    }

    public int[] getGrades() {

        return grades;
    }

    public int getGpa() {
        return gpa;
    }

    public String getGraduateCertificate() {
        return graduateCertificate;
    }

    public String getAdvisor() {
        return advisor;
    }

    //  Constructor
    public Student(int id, String name, String surname, int year, String department){

        super(department);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
        coursesTaken = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];

    }

    //  toString method
    public String toString(){
        return String.format("\nid: %d\nName:%s,\nSurname:%s,\nYear:%d\nStudentId:%s,\nGPA:%d\nAdvisor:%s\n"
                , getId(), getName(), getSurname(), getYear(), getStudentId(), getGpa(), getAdvisor());
    }
}
