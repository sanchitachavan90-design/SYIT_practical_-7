package practical1;
import java.util.*;
public class Practical1 
{
    public static void main(String[] args) 
    {
       System.out.println("Enter whether assignment is submitted:");
       Scanner t=new Scanner(System.in);
       boolean assignment=t.nextBoolean();
       if(assignment)
            System.out.print("assignment submitted:");
       else
            System.out.println("assignment not submitted");
    } 
}
