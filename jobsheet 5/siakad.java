import java.util.Scanner;

public class siakad {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String nama, nim, kelas;
    //char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUts, nilaiAkhir, uas;
    double nilaiSetara = 0;
    String nilaiHuruf = "";
    String kualifikasi = "";
    
    System.out.println(" ==================");
    System.out.println("======SIAKAD========");
    System.out.println(" ==================");
    
    //input
    System.out.print("Masukkan nama\t\t :");
    nama = sc.nextLine();

    System.out.print("Masukkan nim\t\t :");
    nim = sc.nextLine();

    System.out.print("Masukkan kelas\t\t :");
    kelas = sc.nextLine();
  
    System.out.print("Masukkan no. absen\t :");
    absen = sc.nextByte();

    System.out.print("Masukkan nilai kuis\t :");
    nilaiKuis = sc.nextDouble();

    System.out.print("Masukkan nilai tugas\t :");
    nilaiTugas = sc.nextDouble();

    System.out.print("Masukkan nilai UTS\t :");
    nilaiUts = sc.nextDouble();

    System.out.print("Masukkan nilai UAS\t :");
    uas = sc.nextDouble();  
    
    //logic
    nilaiAkhir = (nilaiKuis*20/100) + (nilaiTugas*15/100) + (nilaiUts*30/100) + (uas*35/100);

    //percabangan nilai huruf, nilai setara, dan kualifikasi
    if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
        nilaiHuruf = "A";
        nilaiSetara = 4;
        kualifikasi = "Sangat baik";
    }
    else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
        nilaiHuruf = "B+";
        nilaiSetara = 3.5;
        kualifikasi = "Lebih dari baik";
    }
    else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
        nilaiHuruf = "B";
        nilaiSetara = 3;
        kualifikasi = "baik";
    }
    else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
        nilaiHuruf = "C+";
        nilaiSetara = 2.5;
        kualifikasi = "Lebih dari cukup";
    }
    else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
        nilaiHuruf = "C";
        nilaiSetara = 2;
        kualifikasi = "Cukup";
    }
    else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
        nilaiHuruf = "D";
        nilaiSetara = 1;
        kualifikasi = "Kurang";
    }
    else if (nilaiAkhir <= 39) {
        nilaiHuruf = "E";
        nilaiSetara = 0;
        kualifikasi = "Gagal";
    }

    //output
    System.out.println("nama:" + nama);
    System.out.println ("NIM: " + nim);
    System.out.println("kelas:" + kelas);
    System.out.println("absen:" + absen);
    System.out.println("nilai akhir:" + nilaiAkhir );
    System.out.println("nilai huruf:" + nilaiHuruf );
    System.out.println("nilai setara:" + nilaiSetara );
    System.out.println("kualifikasi:" + kualifikasi );
    

   
        

  }
}