
import java.util.Scanner;


public class kuis {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int hargaJual, hargaBeli, biayaPengiriman, biayaPengemasan, diskon, keuntunganHp, terjual, jumlahKeuntunganItem;

      //hp

      //input
      System.out.println("=====handphone=====");
      System.out.print("harga beli hp: RP");
      hargaBeli = input.nextInt();
      System.out.print("harga jual hp: RP");
      hargaJual = input.nextInt();
      System.out.print("harga pengemasan hp: RP");
      biayaPengemasan = input.nextInt();
      System.out.print("biaya pengiriman: RP");
      biayaPengiriman = input.nextInt();
      System.out.print("diskon: RP");
      diskon = input.nextInt();
      System.out.print("jumlah terjual: ");
      terjual = input.nextInt();
      
      //perhitungan

      keuntunganHp = hargaJual-hargaBeli-biayaPengiriman-biayaPengemasan-diskon;
      jumlahKeuntunganItem = terjual - ((10/100)*terjual);

      //output
      System.out.println("keuntungan hp: RP." + keuntunganHp);
      System.out.println("jumlah keuntungan hp: " + jumlahKeuntunganItem);

      //kabel

      int  keuntunganKabel;

      //input
      System.out.println("=====kabel=====");
      System.out.print("harga beli kabel: RP");
      hargaBeli = input.nextInt();
      System.out.print("harga jual kabel: RP");
      hargaJual = input.nextInt();
      System.out.print("harga pengemasan kabel: RP");
      biayaPengemasan = input.nextInt();
      System.out.print("biaya pengiriman: RP");
      biayaPengiriman = input.nextInt();
      System.out.print("diskon: RP");
      diskon = input.nextInt();
      System.out.print("jumlah terjual: ");
      terjual = input.nextInt();
      
      //perhitungan

      keuntunganKabel= hargaJual-hargaBeli-biayaPengiriman-biayaPengemasan-diskon;
      jumlahKeuntunganItem = terjual - ((10/100)*terjual);

      //output

      System.out.println("keuntungan kabel: RP." + keuntunganKabel);
      System.out.println("jumlah keuntungan kabel: " + jumlahKeuntunganItem);

      //earphone

            int keuntunganEarphone;

      //input
      System.out.println("=====earphon=====");
      System.out.println("harga beli earphon: RP");
      hargaBeli = input.nextInt();
      System.out.println("harga jual earphon: RP");
      hargaJual = input.nextInt();
      System.out.println("biaya pengemasan earphon: RP");
      biayaPengemasan = input.nextInt();
      System.out.println("biaya pengiriman: RP");
      biayaPengiriman = input.nextInt();
      System.out.println("diskon: RP");
      diskon = input.nextInt();
      System.out.println("jumlah terjual: ");
      terjual = input.nextInt();
      
      //perhitungan

      keuntunganEarphone = hargaJual-hargaBeli-biayaPengiriman-biayaPengemasan-diskon;
      jumlahKeuntunganItem = terjual - ((10/100)*terjual);

      //output

      System.out.println("keuntungan hp: RP." + keuntunganEarphone);
      System.out.println("jumlah keuntungan hp: " + jumlahKeuntunganItem);

      //perhitungan akhir   
      double presentaseKeuntungan, rataRata, target, totalKeuntungan;

      totalKeuntungan = keuntunganHp + keuntunganKabel + keuntunganEarphone;
      rataRata = totalKeuntungan/3;
      //input
      System.out.println("target: ");
      target = input.nextInt(); 
      target = totalKeuntungan/target * 100;
      //output
      System.out.println("rata-rata." + (int) rataRata);
      System.out.println("presentase keuntungan: " + (int) target);





  }
}
