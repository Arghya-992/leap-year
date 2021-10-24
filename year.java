import java.util.*;
public class year {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     System.out.println("ENter a year: ");
     int year = sc.nextInt();
      
     boolean leapyear = false;

    if (year % 4 == 0) {

        if (year % 100 == 0) {
 
          if (year % 400 == 0)
            leapyear = true;
          else
            leapyear = false;
        } else
          leapyear = true;
      } else
        leapyear = false;
  
      if (leapyear)
        System.out.println("This is a leap year: "+year);
      else
        System.out.println(" This is not a leap year: "+year);
    }
  }