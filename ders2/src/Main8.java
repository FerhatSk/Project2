import java.util.ArrayList;
import java.util.Collections;

public class Main8 {

    public static void main(String[] args) {


        ArrayList<Integer> liste=new ArrayList<>();


        int sayı=0;

        for (int i=0;i<10;i++){
            sayı=(int) (Math.random() * 100) + 1;
            liste.add(sayı);
        }


        System.out.println("Dizinin elemanları: ");
        for (int eleman:liste){
            System.out.print(eleman+" ");
        }

        System.out.println("");

        int min = Collections.min(liste);
        int max = Collections.max(liste);

        // Sonuçları ekrana yazdır
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);









    }
}
