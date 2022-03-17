import java.util.HashMap;
import java.util.Map;

public class C4_Map
{
    public static void main(String[] args)
    {
        // MAP-ELE SUNT STRUCTURI DE DATE NEORDONATE!
        // map = o reprezentare de date in sistem cheie valoare
        // exemplu: gigel are nota 10, costel are nota 9

        // 1. declaram un map
        Map<String,Integer> noteElevi = new HashMap<>(); // copy-paste

        // adaugam elemente
        noteElevi.put("Gigel", 10);
        noteElevi.put("Costel", 9);
        noteElevi.put("Ana", 10);
        System.out.println(noteElevi);

        // aflu notele
        System.out.println("Ana are nota: " + noteElevi.get("Ana"));

        // suprascriere/actualizam valori
        noteElevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la: " + noteElevi.get("Costel"));

        // aflam dimensiunea
        System.out.println(noteElevi.size());

        // stergem valori
        noteElevi.remove("Gigel");
        System.out.println(noteElevi.size());
        System.out.println(noteElevi);


        // 2. declaram si initializam cu valori
        // map nu este ordonat
        Map<String, Integer> luni = new HashMap<>() // copy-paste
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};
        System.out.println(luni);
    }
}
