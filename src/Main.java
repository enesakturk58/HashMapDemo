import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<String,String>();

        sozluk.put("Book","Kitap");
        sozluk.put("Table","Masa"); // Table Key'dir. Masa Value'dir.
        sozluk.put("Computer","Bilgisayar");

        System.out.println(sozluk);
        System.out.println(sozluk.get("Table")); // get sadece key alir.
        System.out.println(sozluk.get("Kitap"));
        System.out.println(sozluk.size());

        System.out.println("--------------");
        for (String item:sozluk.keySet()){ // sıralı bir şekilde getirmez buna çok dikkat edilmeli.
            System.out.println(item);
        }

        System.out.println("--------------");
        for (String item:sozluk.values()){
            System.out.println(item);
        }

        System.out.println("--------------");
        for (String item:sozluk.keySet()){
            System.out.println("Eleman: " + item + ", Deger: " + sozluk.get(item));
        }

        System.out.println("--------------");
        sozluk.remove("Book");
        System.out.println(sozluk);

        System.out.println("--------------");
        sozluk.clear();
        System.out.println(sozluk);
        System.out.println(sozluk.size());
    }
}