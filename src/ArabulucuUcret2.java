import java.util.Scanner;
/**
 * arabuluculukilk
 */
public class ArabulucuUcret2 {

  public static void main(String[] args) {
    System.out.print("Anlaşma Miktarını Giriniz: ");
    Scanner veri = new Scanner (System.in);

    int anlasmaMiktari = veri.nextInt();

    double sonuc = 0;

    if (anlasmaMiktari > 0) {  

      //--- eğer anlaşma miktarı 8.840.000 TL üzerindeyse --- 
      if (anlasmaMiktari > 8840000){
        sonuc = (
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + (260000 * 0.04)
                  + (520000 * 0.03)
                  + (1560000 * 0.02)
                  + (2080000 * 0.015)
                  + (4160000 * 0.01)
                  + ((anlasmaMiktari - 8840000) * 0.005)
                );
      }

      //--- (eğer anlaşma miktarı 4.680.000 TL'den büyük) ve (8.840.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 4680000 && anlasmaMiktari <= 8840000){
        sonuc = (  
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + (260000 * 0.04)
                  + (520000 * 0.03)
                  + (1560000 * 0.02)
                  + (2080000 * 0.015)
                  + ((anlasmaMiktari - 4680000) * 0.01)
                );
      }

      //--- (eğer anlaşma miktarı 4.160.000 TL'den büyük) ve (4.680.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 4160000 && anlasmaMiktari <= 4680000){
        sonuc = (
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + (260000 * 0.04)
                  + (520000 * 0.03)
                  + (1560000 * 0.02)
                  + ((anlasmaMiktari - 2600000) * 0.015)
                );
      }
      //--- (eğer anlaşma miktarı 2.600.000 TL'den büyük) ve (4.160.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 2600000 && anlasmaMiktari <= 4160000){
        sonuc = (  
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + (260000 * 0.04)
                  + (520000 * 0.03)
                  + (1560000 * 0.02)
                  + ((anlasmaMiktari - 2600000) * 0.015)
                );
      }

      //--- (eğer anlaşma miktarı 1.560.000 TL'den büyük) ve (2.600.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 1560000 && anlasmaMiktari <= 2600000){
        sonuc = (  
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + (260000 * 0.04)
                  + (520000 * 0.03)
                  + ((anlasmaMiktari - 1040000) * 0.02)
                );
      }

      //--- (eğer anlaşma miktarı 1.040.000 TL'den büyük) ve (1.560.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 1040000 && anlasmaMiktari <= 1560000){
        sonuc = (  
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + (260000 * 0.04)
                  + (520000 * 0.03)
                  + ((anlasmaMiktari - 1040000) * 0.02)
                );
      }

      //--- (eğer anlaşma miktarı 520.000 TL'den büyük) ve (1.040.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 520000 && anlasmaMiktari <= 1040000){
        sonuc = (  
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + (260000 * 0.04)
                  + ((anlasmaMiktari - 520000) * 0.03)
                );
      }
      
      //--- (eğer anlaşma miktarı 260.000 TL'den büyük) ve (520.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 260000 && anlasmaMiktari <= 520000){
        sonuc = (
                    (100000 * 0.06)
                  + (160000 * 0.05)
                  + ((anlasmaMiktari - 260000) * 0.04)
                );
      }
      
      //--- (eğer anlaşma miktarı 100.000 TL'den büyük) ve (260.000 TL'den küçük veya eşitse) --- 
      else if (anlasmaMiktari > 100000 && anlasmaMiktari <= 260000) {

        sonuc = (
                    (100000 * 0.06)
                  + ((anlasmaMiktari - 100000) * 0.05)
                );
      }

      //--- eğer anlaşma miktarı 100.000 TL'den küçük veya eşitse --- 
      else if (anlasmaMiktari <= 100000){

        sonuc = (anlasmaMiktari * 0.06);
        //--- eğer arabuluculuk ücreti hesaplama sonucu 1.600 TL'den küçükse --- 
        if (sonuc < 1600.0){
          sonuc = 1600.0;
        }
        //--- eğer arabuluculuk ücreti hesaplama sonucu 1.600 TL'den büyükse --- 
        else{
          sonuc = (anlasmaMiktari * 0.06);
        }
           
      }
      System.out.println("Arabuluculuk Ücretiniz: " + sonuc + " -TL'dir.");

    }

    else {
      System.out.println("Geçersiz miktar girdiniz. (0'dan büyük olmalı.)");
    }
    veri.close();
  } 
}
