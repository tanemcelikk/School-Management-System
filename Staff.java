public abstract class Staff {
    private int id;
    private String name;
    private String surname;
    private int working_hours;
    private String task_information;
    private String work_type;
    //six-argument constructor
    public Staff(int id_,String name_,String surname_,int workinghours,String taskinformation,String worktype)
    {
        name=name_;
        surname=surname_;
        task_information=taskinformation;
        work_type=worktype;
        setid(id_);
        setWorkinghours(workinghours);
    }//end of constructor
    public void setid(int id_)
    {
        id=id_;
    }
    public int getid()
    {
        return id;
    }
    public void setName(String name_)
    {
        name=name_;
    }
    public String getName()
    {
        return name;
    }
    public void setSurname(String surname_)
    {
        surname=surname_;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setTaskinfo(String taskinformation)
    {
        task_information=taskinformation;
    }
    public String getTaskinfo()
    {
        return task_information;
    }
    public void setWorktype(String worktype)
    {
        work_type=worktype;
    }
    public String getWorktype()
    {
        return work_type;
    }
    public int getWorkinghours()
    {
        return working_hours;
    }
    public void setWorkinghours(int workinghours)
    {
        working_hours=workinghours;
    }
    //return String representation of Staff object
    public String toString()
    {
        return String.format( "\nid: %d\nName:%s,\nSurname:%s,\nTask Info:%s\nWork Type:%s,\nWorking Hours:%d\n",
                getid(),getName(), getSurname(), getTaskinfo(),getWorktype(), getWorkinghours());
    } // end method toString
}
