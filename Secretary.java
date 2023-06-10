public class Secretary extends Staff {
    public Secretary(int id_,String name_,String surname_,int working_hours,String taskinformation,String worktype)
    {
        super( id_,name_,surname_,working_hours,taskinformation,worktype);

    } // end six-argument Secretary constructor

    public void setCourse(String code, String name, int credit, String category, Staff lecturer){
        Courses course = new Courses( code,  name,  credit,  category, lecturer);

    }



}