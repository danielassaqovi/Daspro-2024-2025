import java.util.Scanner;

public class tagihanListrik12 {

  public static void main(String[] args) {

    double tagihan, pemakaiankwh, harga = 1.500, bataskwh = 500;
    boolean statusTagihan;
    //input 
    Scanner sc = new Scanner(System.in);

    //output
    System.out.println("---------------------");
    System.out.println("---TAGIHAN LISTRIK---");
    System.out.println("---------------------");

    System.out.print("Masukkan pemakaian : ");
    pemakaiankwh = sc.nextDouble();

    //logic
    tagihan = pemakaiankwh * harga;
    statusTagihan = pemakaiankwh > bataskwh;

    System.out.println("tagian listrik : " + tagihan);
    System.out.println("batas pemakaian lebih dari 500kwh" + statusTagihan);

  }
}
