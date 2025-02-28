import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main5 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String kelime="dax";
        ArrayList<String> dizi=new ArrayList<>();



        for (int i=0;i<10;i++) {
            System.out.print("Kelime yazınız:");
            kelime = scanner.nextLine();
            dizi.add(kelime);
        }
        Collections.sort(dizi);
        System.out.println(dizi);


    }
}
