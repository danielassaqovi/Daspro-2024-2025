import java.util.Scanner;

public class Siakad12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String nama, nim, kelas;
    //char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUts, nilaiAkhir, uas;
    
    
    //inpit
    System.out.print("Masukkan nama :");
    nama = sc.nextLine();
    System.out.print("Masukkan nim :");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas :");
    kelas = sc.nextLine();
    //.charAt(0);
    System.out.print("Masukkan absen :");
    absen = sc.nextByte();
    System.out.print("Masukkan nilai kuis :");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas :");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai UTS :");
    nilaiUts = sc.nextDouble();
    System.out.print("Masukkan nilai UAS :");
    uas = sc.nextDouble();  
    
    //perhitungan
    nilaiAkhir = (nilaiKuis*20/100) + (nilaiTugas*15/100) + (nilaiUts*30/100) + (uas*35/100);
  
    //output
    System.out.println("nama:" + nama);
    System.out.println ("NIM: " + nim);
    System.out.println("kelas:" + kelas);
    System.out.println("absen:" + absen);
    System.out.println("nilai akhir:" + nilaiAkhir );
    

   
        

  }
}