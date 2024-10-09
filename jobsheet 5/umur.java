
import java.util.Scanner;

public class umur{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int usia;

      //variabel
      String kategori = "";

      System.out.print("Masukkan usia\t: ");
      usia = sc.nextInt();

      //logic
      if (usia >= 0 && usia <= 12){
        kategori = "Anak";
        System.out.println("Kategori usia\t:" + kategori);
      }
      else if (usia >= 13 && usia <= 19){
        kategori = "Remaja";
        System.out.println("Kategori usia\t:" + kategori);
      }
      else if (usia >= 20 && usia <= 64){
        kategori = "Dewasa";
        System.out.println("Kategori usia\t:" + kategori);
      }
      else if (usia >= 65){
        kategori = "Lansia";
        System.out.println("Kategori usia\t:" + kategori);
      }
      else {
        System.out.println("Input tidak valid");
      }
      

  }
}