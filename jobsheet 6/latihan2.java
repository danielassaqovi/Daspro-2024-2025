

public class latihan2 {
  public static void main(String[] args) {
      
      String jenisBuku = "komik";
      int jumllahBuku = 5;
      double diskon=0;

      if (jenisBuku == "komik"){
        if (jumllahBuku > 2){
          diskon = 0.12;
        }else{
          diskon = 0.1;
        }

      }else if(jenisBuku == "novel"){
          diskon = 0.07;
          if (jumllahBuku == 3){
            diskon = diskon + 0.02;
          }else{
            diskon = diskon + 0.01;
          }
      }else{
        if(jumllahBuku == 3);
        diskon = diskon +0.05;
      }

      
      
      

  }
}