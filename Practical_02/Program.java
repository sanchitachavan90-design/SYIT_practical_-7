package practical2;
import java.util.*;
public class Practical2 
{
    public static void main(String[] args) 
    {
       String name;
       int m1,m2,m3;
       Scanner t=new Scanner(System.in);
        System.out.println("Enter the name:");
       name=t.nextLine();
        System.out.println("Enter the marks of SM, OS, WD:");
        m1=t.nextInt();
        m2=t.nextInt();
        m3=t.nextInt();
        System.out.println("Student Name:"+name);
        if(m1>m2 && m1>m3)
            System.out.println("Marks of SM is greater.");
        else if(m2>m1 && m2>m3)
            System.out.println("Marks of OS  is greater.");
        else
            System.out.println("Marks of WD is greater.");  
    } 
}
