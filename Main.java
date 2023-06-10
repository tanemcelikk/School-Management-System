public class Main {
    public static void main(String[] args) {

        //  Lecturerdan öğrenciye Hem ders hem not atama
        Student student = new Doctoral(5,"a","b",5, "a");
        student.setCoursesTaken("OOP");
        student.setCoursesTaken("Data");
        Lecturer lecturer = new Lecturer(5,"Alperen","Aydın",5,"a","b");
        lecturer.addCourseGrade(student);


        // Sekreterden ders ataması yapan metot
        Secretary secretary = new Secretary(5,"a","a",5,"a","a");
        secretary.setCourse("a","a",9,"a", lecturer);




    }
}