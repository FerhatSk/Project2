import java.util.Arrays;

public class Main10 {

    public static void main(String[] args) {

        int[] sayilar = {5, 3, 8, 1, 9, 7};

        // Diziyi sıralama
        Arrays.sort(sayilar);

        // 7 sayısının indeksini bul
        int indeks = Arrays.binarySearch(sayilar, 7);

        // 1. indeks ile 4. indeks arasındaki elemanları kopyala (4 dahil değil)
        int[] yeniDizi = Arrays.copyOfRange(sayilar, 1, 4);

        //İki dizinin tüm elemanlarının eşit olup olmadığını kontrol eder.
        int[] dizi = {1, 2, 3, 4, 6};
        System.out.println("Dizi ve sayılar eşit mi? " + Arrays.equals(dizi, sayilar));

        // Tüm elemanları 7 yapar
        Arrays.fill(sayilar, 7);





    }
}
