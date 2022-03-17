public class C5_For
{
    public static void main(String[] args)
    {
        // 1. for = loop, structura repetitiva (o zona de cod care se repeta pana atinge valoarea declarata)
        // ne spune: de unde incepem?
        // pana unde mergem?
        // pasul de parcurgere

        // EXERCITIU: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++) // unde i++ => i=i+1   =>  i+=1;
        {
            System.out.println("Dalmatianul cu numarul: " + i);
        }

        // EXERCITIU: ne ajuta sa parcurgem un array prin intremediul indexului
        int[] numere = {3, 7, 10, 20, 30}; //
        for (int i = 0; i < numere.length; i++) // unde i++ => i=i+1
        {
            System.out.println("elementul are index-ul " + i + " si valoarea " + numere[i]);
        }



        // 2. for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere)
        {
            System.out.println("Numarul este: " + numar);
        }


        // parcurgem un array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori)
        {
            System.out.println("Culoarea actuala este: " + culoare);
        }

        // EXERCITIU FOR EACH: suma numerelor din array
        int suma = 0;
        for (int numar : numere)
        {
            suma = suma + numar;
        }
        System.out.println(suma);
    }
}
