import java.util.Scanner;

public class kafe12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean keanggotaan;
    int jmlKopi, jmlTeh, jmlRoti;
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
    float diskon = 10 / 100f;

    System.out.print("Masukkan keanggotaan (true/false):");
    keanggotaan = input.nextBoolean();
    System.out.print("Maskkan jumlah pembelian kopi:");
    jmlKopi = input.nextInt();
    System.out.print("Masukkan jumlah pembelian teh:");
    jmlTeh = input.nextInt();
    System.out.print("Masukkan jumlah pembelian roti:");
    jmlRoti = input.nextInt();

    double totalHarga = (jmlKopi*hargaKopi) + (jmlTeh*hargaTeh) + (jmlRoti*hargaRoti);
    double nominalBayar = totalHarga - (diskon2 * totalHarga);

    //output
    System.out.println(" keanggotaan pelanggan " + keanggotaan);
    System.out.println(" item pembelian  "  + jmlKopi + " kopi, "  + jmlTeh + " teh, " + jmlRoti + " roti");
    System.out.println(" nominal bayar rp " + nominalBayar);


  }
}