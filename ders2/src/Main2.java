import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        int dizi[]={5, 3, 8, 3, 1, 5, 8};

        Arrays.sort(dizi);

        System.out.println("Dizide tekrar eden sayılar: ");
        for(int i=0;i<7;i++){
            if(dizi[i]==dizi[i+1]){
                System.out.println(dizi[i]);
            }

        }



    }
}
