import java.util.ArrayList;
import java.util.Arrays;

public class C4_Array
{
    public static void main(String[] args)
    {
        // declarare si initializare cand stim valorile
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"}; // cand dorim sa folosim text trebuie sa declaram String[]
        int[] numere = {1, 33, 88, 99, 111}; // cand dorim sa folosim numere trebuie sa declaram int[]

        // ce stim despre un array?:
        // 1. contine mai multe elemente de acelasi tip
        // 2. accesam elementele prin index, care incepe de la 0
        // 3. are o dimensiune fixa!
        // 4. are proprietatea lenght care ne da dimenisunea array-ului

        System.out.println(elevi[2]);

        // suprascrierea unei valori din interiorul array-ului:
        elevi[2] = "Sebi"; // pentru elevul care are index-ul 2 ii atribuim o valoare noua care il suprascrie
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        // putem sa ne jucam cu valorile din spate:
        System.out.println(elevi[0] + " " + elevi[1]); // concatenare de stringuri => Gigel Costel
        System.out.println("Nr total de elevi in clasa sunt: " + elevi.length + ". Daca mai vin 5 elevi noi atunci nr final de elevi va fi: " + (elevi.length + 5) );
        System.out.println("Elevi din clasa noastra sunt: " + Arrays.toString(elevi) + ". Nr total de elevi in clasa sunt: " + elevi.length + ". Daca mai vin 5 elevi noi, atunci nr final de elevi va fi: " + (elevi.length + 5) );

        // sa printam tot timpul ultimul element indiferent de marime
        System.out.println("Last place: " + elevi[3]); // aici printeaza specific elevul cu index-ul 3
        System.out.println("Last place: " + elevi[elevi.length - 1]); // aici am transformat prin ecuatie sa imi printeze mereu ultimul index din interiorul lenght-ului = codul functioneaza dinamic!
        System.out.println(Arrays.toString(elevi)); // printeaza total lista finala de array


        // declarare si alocare de memorie pentru array-uri la care nu stim notele initiale
        int[] note = new int[6]; // traducere: un array de tip: int note = valoarea new int[5] - adica contine 5 valori cu index de la 0-->4 (toate valorile sunt 0 daca nu ii atribuim noi o valoare)
        note[0] = 10; // 1. index-ului 0 i-am atribuit valoarea 10
        note[1] = 9; // 2. index-ului 1 i-am atribuit valoarea 9
        note[2] = 5; // 3. index-ului 2 i-am atribuit valoarea 5
        note[3] = 4; // 4. index-ului 3 i-am atribuit valoarea 4
        note[4] = 1; // 5. index-ului 4 i-am atribuit valoarea 1
        System.out.println(note[5]);

        String[] culori = new String[4];
        culori[0] = "Albastru";
        culori[1] = "Rosu";
        culori[2] = "Galben";
        culori[3] = "Verde";
        System.out.println(culori[(culori.length + 1 - 1) - culori.length]);
        System.out.println(culori[(culori.length + 2 - 1) - culori.length]);
        System.out.println(culori[(culori.length + 3 - 1) - culori.length]);
        System.out.println(culori[(culori.length + 4 - 1) - culori.length]);
    }

}
