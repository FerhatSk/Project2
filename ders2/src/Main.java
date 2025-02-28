import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sayı= 0;
        int ortalama=0;
        int dizi[]=new int[10];

        for (int i=0;i<10;i++){
            System.out.print("Sayı giriniz:");
            sayı= scanner.nextInt();
            dizi[i]=sayı;
            ortalama=ortalama+sayı;
        }
        ortalama=ortalama/10;
        System.out.println("Dizinin ortalaması: "+ortalama);
        System.out.print("Dizinin elemanlarından 50'den büyük olanlar: ");
        for (int eleman:dizi){
            if (eleman>50){
                System.out.print(eleman+" ");
            }

        }



    }
}