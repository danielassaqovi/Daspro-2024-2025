
import java.util.Scanner;

public class gajiBulananKaryawan {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  int upj, jamKerja, gajiHarian, gajiPokok, gajiPlusBonus, gajiBersih, jumlahHari;
  float pajak = 5/100f, bonus = 10/100f;

  //input
  System.out.print("jumlah jam kerja: ");
  jamKerja = input.nextInt();
  System.out.print("upah perjam: ");
  upj = input.nextInt();
  System.out.print("jumlah hari dalam 1 bulan: ");
  jumlahHari = input.nextInt();

  //logic
  gajiHarian = jamKerja * upj;
  gajiPokok = gajiHarian * jumlahHari;
  gajiPlusBonus = gajiPokok + (int) (gajiPokok * bonus);
  gajiBersih = gajiPlusBonus - (int) (gajiPlusBonus * pajak);

  //output
  System.out.println("gaji pokok karyawan: " + gajiPokok);
  System.out.println("gaji setelah bonus: " + gajiPlusBonus);
  System.out.println("gaji besih karyawan:" + gajiBersih);



  }
}