public class Courses {
    private String code;
    private String name;
    private int credit;
    private String location;
    private int[] studentids;
    private Staff lecturer;
    private String category;//undergraduate or graduate
    //  Constructor
    public Courses(String code, String name, int credit, String category, Staff lecturer){
        this.code=code;
        this.name = name;
        this.credit=credit;
        this.category = category;
        setLecturer(lecturer);
    }


    //Getters and setters

   // public void setCode(int code_) {code=code_;}
    //public void setName(String name_){name=name_;}
    // public void setCredit(int credit_) {this.credit=credit_;}
    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location_)
    {
        location=location_;
    }
    public int getCredit()
    {
        return credit;
    }


    public void setCategory(String category_)
    {
        category=category_;
    }
    public String getCategory()
    {
        return category;
    }
    public void setLecturer(Staff lecturer_)
    {
        lecturer=lecturer_;
    }
    public Staff getLecturer()
    {
        return lecturer;
    }
    public int[] getStudents() {
        return studentids;
    }//seti oluşturulacak mı?int dizisi olması doğru mu?

    //  toString method
    public String toString(){
        return String.format("\nCode: %s,\nName:%s,\nCredit:%d,\nLocation:%s\n"
                , getCode(), getName(),getCredit(),getLocation());
    }//end of toString method
}