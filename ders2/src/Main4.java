import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sayı=0;
        ArrayList<Integer> liste=new ArrayList<>();

        for (int i=0;i<10;i++) {
            System.out.print("Sayı giriniz:");
            sayı = scanner.nextInt();
            liste.add(sayı);
        }

        Collections.sort(liste, Collections.reverseOrder());

        System.out.println(liste);


    }
}
