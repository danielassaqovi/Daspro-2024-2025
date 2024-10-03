import java.util.Scanner;

public class pemilihanHari12{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String dayType;

      //input
      System.out.print("Input day number: ");
      int dayNumber = sc.nextInt();

      //percabangan switch case
      switch (dayNumber) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
              dayType = "weekday";
              break;
          case 6:
          case 7:
              dayType = "weekend";
              break;
          default:
              dayType = "invalid day number";
      }
      //output
      System.out.println(dayNumber + " is a " + dayType );

  }
}