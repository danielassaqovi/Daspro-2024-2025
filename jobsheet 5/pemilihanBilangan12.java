
import java.util.Scanner;

public class pemilihanBilangan12{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan sebuah angka: ");
      int angka = input.nextInt();

      //percabangan if else
      if (angka % 2 == 0)
      {
        System.out.println("Angka" + angka + " termasuk bilangan genap");
      }
      else
      {
        System.out.println("Angka" + angka + " termasuk bilangan ganjil");
      }
  }
}