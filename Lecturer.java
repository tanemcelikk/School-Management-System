public class Lecturer extends Staff {
    private String[] listofCourses;
    //private int[] grades;
    private static final int MAX_COURSES = 10; //We will need ArrayIndexOutOfBoundsException
    private int numCourses;
    public Lecturer(int id_,String name_,String surname_,int workinghours,String taskinformation,String worktype)
    {
        super( id_,name_,surname_,workinghours,taskinformation,worktype);
        listofCourses = new String[MAX_COURSES];
        //grades = new int[MAX_COURSES];
        numCourses=0;
    } // end six-argument TechnicalStaff constructor

   public void addCourse(String listofCourses,int grades) {
        this.listofCourses[numCourses] = listofCourses;
        //this.grades[numCourses]=grades;
        numCourses++;
    }//adding courses and grades

    public void addCourseGrade(Student student){
        student.setGrades();
    }
}
