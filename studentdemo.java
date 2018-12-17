import java.util.Scanner;
public class studentdemo {   
     public static int id,credithour;
     public static String batch,dep;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter id");
        int id=s.nextInt();
        System.out.println("Enter credit hour");
        int credithour=s.nextInt();
        System.out.println("Enter batch");
        String batch=s.next();
        System.out.println("Enter department");
        String dep=s.next();
        System.out.println("Enter day");
        int day=s.nextInt();
        System.out.println("Enter month");
        int month=s.nextInt();
        System.out.println("Enter year");
        int year=s.nextInt();
        
        DOB d1 = new DOB(day,month,year);
        Student d=new Student(id,credithour,dep,batch,d1);
         
        d.cal();
        System.out.println(d.toString());
        
    }
    
    
    
    
    
}
