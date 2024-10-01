

import java.util.Scanner;


public class kasir {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int jumlahUang, hargaBarang, totalHarga, totalBelanja, kembalian;
      byte jumlahBarang;

      //input
      System.out.print("jumlah barang: ");
      jumlahBarang = input.nextByte();
      System.out.print("harga barang: ");
      hargaBarang = input.nextInt();
      //logic
      totalBelanja = jumlahBarang * hargaBarang;
      //output
      System.out.println("total belanja: " + totalBelanja);
     
      //input
      System.out.print("jumlah uang: ");
      jumlahUang = input.nextInt();
      //logic
      kembalian = jumlahUang - totalBelanja;
      //output
      System.out.println("kembalian: " + kembalian);

      
      

  }

}