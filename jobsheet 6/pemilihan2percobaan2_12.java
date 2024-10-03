
import java.util.Scanner;

public class pemilihan2percobaan2_12{
  public static void main(String[] args) {
      Scanner sc12 = new Scanner(System.in);

      int pilihanMenu;
      String member;
      double diskon, totalBayar, harga;

      System.out.println("=-----------------= ");
      System.out.println("===MENU KAFE JTI===");
      System.out.println("=-----------------= ");
      System.out.println(" 1. kopi");
      System.out.println(" 2. teh");
      System.out.println(" 3. roti");
      System.out.println("=--------------------------------------=");
      System.out.print("Masukkan angka dari menu yang dipilih: ");
      pilihanMenu = sc12.nextInt();
      sc12.nextLine();

      System.out.print("Apakah punya member (y/n) ?: ");
      member = sc12.nextLine();
      System.out.println("=--------------------------------------=");

      if (member.equalsIgnoreCase("y")) {
        diskon = 0.1;
        System.out.println("Diskon 10%"); 
      } else {
        diskon = 0;
        System.out.println("Tidak ada diskon");
      }

      if (member.equalsIgnoreCase(member)) {
          // diskon = 0.10;
          // System.out.println("Besar diskon: 10% ");
          if (pilihanMenu == 1) {
            harga = 12000;
            System.out.println("Harga kopi: " + harga);
          }else if (pilihanMenu == 2){
            harga = 7000;
            System.out.println("Harga teh: " + harga);
          }else if (pilihanMenu == 3){
            harga = 2000;
            System.out.println("Harga roti: " + harga);
          }
      }

      totalBayar = harga - (harga*diskon);
      System.out.println("Total bayar " + totalBayar);

      


  }
}