import java.util.Scanner;

public class Siakad12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

    System.out.print("Masukkan nama :");
    nama = sc.nextLine();
    System.out.print("Masukkan nim :");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas :");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan absen :");
    absen = sc.nextByte();

    System.out.print("Masukkan nilai kuis :");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas :");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai ujuan :");
    nilaiUjian = sc.nextDouble();

    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

    System.out.println("nama:" + nama + "NIM: " + nim);
    System.out.println("kelas:" + kelas +  "Absen: " + absen);
    System.out.println("nilai akhir:" + nilaiAkhir );
   
        

  }
}