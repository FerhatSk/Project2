import java.util.ArrayList;

public class Main9 {

    public static void main(String[] args) {

        ArrayList<String> liste=new ArrayList<>();

        liste.add("Malatya");
        liste.add("İstanbul");

        // 1. indeksteki elemanı al
        String sehir = liste.get(1);
        System.out.println("1. indeks: " + sehir);

        // 1. indeksteki elemanı "Ankara" ile değiştir
        liste.set(1, "Ankara");

        // 1. indeksteki elemanı kaldır
        liste.remove(1);

        // "Malatya" nesnesini kaldır
        liste.remove("Malatya");

        // Tüm elemanları temizler
        liste.clear();




    }
}
