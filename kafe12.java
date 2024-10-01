import java.util.Scanner;

public class kafe12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean keanggotaan;
    int jmlKopi, jmlTeh, jmlRoti;
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
    int nominalInt;
    byte totalByte;
    float diskon = 10 / 100;
   
    //Masukkan keanggotaan (true/false):
    System.out.print("");
    keanggotaan = input.nextBoolean();
    System.out.print("Maskkan jumlah pembelian kopi:");
    jmlKopi = input.nextInt();
    System.out.print("Masukkan jumlah pembelian teh:");
    jmlTeh = input.nextInt();
    System.out.print("Masukkan jumlah pembelian roti:");
    jmlRoti = input.nextInt();

    double totalHarga = (jmlKopi*hargaKopi) + (jmlTeh*hargaTeh) + (jmlRoti*hargaRoti);
    totalByte = (byte)totalHarga;
    double nominalBayar =  totalHarga - (diskon * totalHarga);
    nominalInt = (int)nominalBayar;
     

    //output
    System.out.println(" keanggotaan pelanggan " + keanggotaan);
    System.out.println(" item pembelian:  "  + jmlKopi + " kopi, "  + jmlTeh + " teh, " + jmlRoti + " roti");
    System.out.println(" total harga: " + totalHarga );
    System.out.println(" ini adalah hasil casting total byte: " + totalByte );
    System.out.println(" nominal bayar: RP." + nominalBayar);
    System.out.println(" ini adalah hasil casting total byte: " + nominalInt );


  }
}