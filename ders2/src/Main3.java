
public class Main3 {

    public static void main(String[] args) {

        int dizi[]={5, -3, 8, 3, -1, -5, 8};

        int pozitifToplam=0;
        int negatifToplam=0;

        for(int eleman:dizi){
            if(eleman<0){
                negatifToplam=negatifToplam+eleman;
            }else{
                pozitifToplam=pozitifToplam+eleman;
            }
        }
        System.out.println("Pozitif sayıların toplamı: "+pozitifToplam);
        System.out.println("Negatif sayıların toplamı: "+negatifToplam);




    }
}
