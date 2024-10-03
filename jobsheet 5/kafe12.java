
import java.util.Scanner;

public class kafe12 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    String menu;
    char sizeCup;
    int jumlah;
    boolean anggota;

    System.out.println(" ============================== ");
    System.out.println("= SELAMAT DATANG DI KEDAI KAMI = ");
    System.out.println(" ============================== ");
    System.out.println(" ");
    System.out.println(" ============================== ");
    System.out.println(" DAFTAR MENU :");
    System.out.println(" Kopi = 12.0000 ");
    System.out.println(" Teh = 7.000 ");
    System.out.println(" Coklat = 20.000 ");
    System.out.println(" ============================== ");
    System.out.println(" ");

    //input
    System.out.print("Masukkan pesanan: ");
    menu = sc.nextLine();
    System.out.print("Ukuran cup: ");
    sizeCup = sc.next().charAt(0);
    System.out.print("Jumlah pesanan: ");
    jumlah = sc.nextInt();
    System.out.print("status keanggotaan (true/false): ");
    anggota = sc.nextBoolean();

    //penentuan harga menu
    double hargaMenu = 0;
    
    switch (menu.toLowerCase()){
      case "kopi":
        hargaMenu = 12000;
        break;
      case "teh":
        hargaMenu = 7000;
        break;
      case "coklat":
        hargaMenu = 20000;
        break;
    }

    //hitung total harga
    double totalHarga = hargaMenu * jumlah;

    //hitung harga up size
    switch (sizeCup) {
        case 'S':
            break;
        case 'M':
          totalHarga += 0.25 * totalHarga;
            break;
        case 'L':
          totalHarga += 0.4 * totalHarga;
            break;
        default:
          System.out.println("size cup yang dipilih tidak tersedia");
          return;
    }

    //hitung diskon status keanggotaan

    double diskon = anggota ? 0 : 0.1;
    double nominalBayar = totalHarga - (diskon * totalHarga);

    //output
    System.out.println("Item pembelian: " + jumlah + " " + menu + "Size cup" + sizeCup);
    System.out.println("Nominal bayar: " + nominalBayar);
    System.out.println(" ================================== ");
    System.out.println("= MOHON DI TUNGGU PESANANYA YA KAK = ");
    System.out.println(" ================================== ");

 } 
}