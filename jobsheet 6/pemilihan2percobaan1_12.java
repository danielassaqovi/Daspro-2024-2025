
import java.util.Scanner;

public class pemilihan2percobaan1_12 {
  public static void main(String[] args) {
      Scanner sc12 = new Scanner(System.in);
  

      System.out.print("Masukkan tahun: ");
      int tahun = sc12.nextInt();

      if (tahun % 4 == 0 ) { //&& tahun % 400 != 0) || (tahun % 4 ==0 && tahun %400 ==0)) {
          if ((tahun % 100) !=0) {
            System.out.println("Tahun kabisat");               
         } else {
            if ((tahun % 400) == 0) 
            System.out.println("Tahun kabisat");
            else 
            System.out.println("Bukan tahun kabisat");
         }
        } else {
          System.out.println("Bukan tahun kabisat");
         
      }
  }
}