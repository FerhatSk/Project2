import java.util.ArrayList;

public class Main6 {

    public static void main(String[] args) {


        ArrayList<Integer> liste=new ArrayList<>();
        ArrayList<Integer> cift =new ArrayList<>();

        int sayı=0;

        for (int i=0;i<20;i++){
            sayı=(int) (Math.random() * 100) + 1;
            liste.add(sayı);
        }

        for (int eleman:liste){
            if(eleman%2==0){
                cift.add(eleman);
            }
        }

        System.out.println("Dizinin elemanları: ");
        for (int eleman2:liste){
            System.out.print(eleman2+" ");
        }
        System.out.println("");
        System.out.println("Dizinin çift elemanları: ");
        for (int eleman3:cift){
            System.out.print(eleman3+" ");
        }




    }
}
