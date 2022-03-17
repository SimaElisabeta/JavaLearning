import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C4_Liste
{
    public static void main(String[] args)
    {
        // LISTELE SUNT STRUCTURI DE DATE ORDONATE!
        // 1. !!! declaram o lista goala care au o dimensiune dinamica!!!! trebuie sa folosim sintaxa cu copy-paste: List<String> fructe = new ArrayList<>(); *pt fructe putem pune orice nume dorim noi
        List<String> fructe = new ArrayList<>(); // EXEMPLU copy-paste cu lista String pentru text

        // cum se adauga elemente in lista:
        fructe.add("mar"); // adaugam mar care devine index 0
        fructe.add("banana"); // adaugam banana care devine index 1
        fructe.add("portocala"); // adaugam portocala care devine index 2
                                 // continua tot asa. Putem lungi lista cat dorim, nu suntem limitati ca la array (cand specificat dimensiunea fianala a listei)


        // cum se iau/printeaza elemente:
        System.out.println("Indexul 0 contine: " + fructe.get(0));
        System.out.println("Indexul 1 contine: " + fructe.get(1));
        System.out.println("Indexul 2 contine: " + fructe.get(2));
        System.out.println("Lista contine: " + fructe.get(0) + ", " + fructe.get(1) + ", " + fructe.get(2));
        System.out.println("Sau lista contine: " + fructe);
        System.out.println(" ");

        // cum se afla index-ul unui element:
        System.out.println("Indexul elementului banana este: " + fructe.indexOf("banana"));

        // este lista goala? vom primi un raspuns de tip boolean
        System.out.println("Verificam daca lista este goala: " + fructe.isEmpty());


        System.out.println(" ");
        // EXERCITIU: daca lista este goala nu mai tinem ore
        System.out.println("EXERCITIU: if lista este goala: ");

        List<String> listaElevi = new ArrayList<>(); // EXEMPLU copy-paste cu lista String pentru text
        listaElevi.add("Marcu");
        listaElevi.add("Gabi");
        listaElevi.add("Adi");

        // dam clear la lista de elevi
        listaElevi.clear(); // = eliminam toate elementele din lista
        listaElevi.add("Andrei");

        if (!listaElevi.isEmpty()) // daca !nu este goala
        {
            System.out.println("Tinem ore");
            System.out.println(listaElevi.get(0) + " este prezent la ore");
        }
        else
        {
            System.out.println("Nu vom tine ore");
        }
        System.out.println(" ");


        // EXERCITIU: cum scoatem elemente din lista si cum printam lista cu elementele ramase?
        System.out.println("EXERCITIU: cum scoatem elemente din lista si cum printam lista cu elementele ramase?");

        List<String> fructeExotice = new ArrayList<>(); // EXEMPLU copy-paste cu lista String pentru text
        fructeExotice.add("kiwi"); // adaugam kiwi care devine index 0
        fructeExotice.add("lime"); // adaugam lime care devine index 1
        fructeExotice.add("kaki"); // adaugam kaki care devine index 2
        fructeExotice.add("struguri"); // adaugam struguri care devine index 3
        fructeExotice.add("banane"); // adaugam struguri care devine index 4
        fructeExotice.add("portocale"); // adaugam struguri care devine index 5


        // aflam dimensiunea listei si ce contine aceasta
        System.out.println("Dimensiunea listei este de: " + fructeExotice.size() + " fructe"); // fructeExotice.length - se foloseste doar la Arrays, nu si la Array list
        System.out.println("Aceasta lista contine fructele urmatoare: " + fructeExotice);
        System.out.println(" ");


        // cum scoatem un element din lista:
        System.out.println("Vom scoate din lista urmatoarele: kaki, lime + ultimul index");
        fructeExotice.remove(2); // scoatem un element folosind valoarea de tip index = "kaki"
        fructeExotice.remove("lime"); // scoatem un element folosind valoarea de tip obiect (adica specificam direct numele obiectului) = "lime"
        fructeExotice.remove(fructeExotice.size() - 1); // scoatem un element folosind calculul de total fructeExotice din lista -1 = ultimul index din lista
        // sau variata mai lunga pentru a elimina din lista ultimul index:
        /*
        int fructeTotalIndex = fructeExotice.size() - 1;
        fructeExotice.remove(fructeTotalIndex);
         */

        // printam lista de elemente noua, din care am scos 3 valori:
        System.out.println("Totalul fructelor care au ramas in lista este de: " + fructeExotice.size() + " fructe");
        System.out.println(fructeExotice); // varianta mai simpla/mai scurta
        System.out.println(" ");



        // 2. !!! declaram o lista imutabila (adica nu mai putem adauga valori prin comanda .add) si o initializam cu valori !!! trebuie sa folosim sintaxa cu copy-paste: List<String> text = Arrays.asList(new String[]{"foo", "bar"}); *pt text putem pune orice nume dorim noi
        // List<String> list = Arrays.asList(new String[]{"foo", "bar"}); // EXEMPLU copy-paste cu lista String pentru text
        System.out.println("2. declaram o lista si o initializam cu valori");

        List<String> alfabet = Arrays.asList(new String[]{"Aa", "Bb", "Cc", "Dd", "Ee"}); // EXEMPLU copy-paste cu lista String pentru sir de caractere
        System.out.println(alfabet);
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77, 88, 100}); // EXEMPLU copy-paste cu lista Integer pentru numere intregi
        System.out.println(numere); // varianta mai simpla/mai scurta
        System.out.println(" ");



        // 3. !!! declaram o lista dinamica la care putem adauga mai multe valori prin comanda .add!!!
        System.out.println("3. declaram o lista dinamica");

        String[] flowers = {"Albastra", "Galbena", "Rosie"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Verde");
        flowerList.add("Mov");
        System.out.println(flowerList); // varianta mai simpla/mai scurta
        System.out.println(" ");

        // aflam ce index ii este atribuit lui Rosie
        System.out.println("aflam ce index ii este atribuit lui Rosie si stergem ce este in acea pozitie ");
        int indexRosie = flowerList.indexOf("Rosie"); // creem o variabila de tip intiger = care ne va da valoarea indexului obiectului "Rosie"
        System.out.println(flowerList.indexOf("Rosie"));
        // stergem ce este in acea pozitie
        flowerList.remove(indexRosie);
        System.out.println(flowerList); // varianta mai simpla/mai scurta
        // System.out.println(Arrays.toString(flowerList.toArray())); // varianta veche mai complexa


    }

}
