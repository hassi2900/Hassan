



public class Student {

private int id,credithour,t;
private String dep,batch;
private DOB dateOfBirth;

public Student()
{
    
}
public Student (int id, int credithour,String dep,String batch,DOB d1)
{
    this.id=id;
    this.credithour=credithour;
    this.batch=batch;
    this.dep=dep;
    dateOfBirth = d1;
}

     public int getid()
    {
        return id;
    }
    public int getcredithour()
    {
        return credithour;
    }
    public String getbatch()
    {
        return batch;
    }
    public String getdep()
    {
        return dep;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void setcredithour(int credithour)
    {
        this.credithour=credithour;
    }
    public void setbatch(String batch)
    {
        this.batch=batch;
    }
    public void setdep(String dep)
    {
        this.dep=dep;
    }
    
    public int cal()
    {
        
       t= credithour*1000;
       return t;
    }
    
    
    @Override
   public String toString()
   {
    
        return "ID "+id+" credit hour"+credithour+" departmant "+dep+" Bath "+batch+" YOur fee "
                +t+"Date of Birth "+dateOfBirth;
    
                }
    
}



