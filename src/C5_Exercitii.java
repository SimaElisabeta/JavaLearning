import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C5_Exercitii
{

    public static int citesteNrTastatura(Scanner scanner)
    {
        int numar = 0;

        do
        {
            System.out.print("Introduce un numar: ");

            // This method reads the number provided using keyboard
            numar = scanner.nextInt();

            if (numar < 1)
            {
                System.out.println("Numarul trebuie sa fie mai mare sau egal cu 1!");
            }
        }
        while (numar < 1);

        return numar;
    }



    // EXERCITIU: 1
    // se citeste de la tastatura un numar N
    // pe rand se vor citi N cuvinte
    // sa se afiseze cuvintele citite pe un singur rand separate cu spatiu
    // sa se foloseasca o lista
    public static void exercitiu1()
    {
        List<String> cuvinte = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int numar = citesteNrTastatura(scan);

        System.out.println("Perfect, ai introdus numarul: " + numar + ". Acum va trebui sa introduci cate un cuvant pentru fiecare numar.");

        for (int i = 1; i <= numar; i++)
        {
            System.out.print("Introduce cuvantul " + i +  ": " );
            String cuvant = scan.next();
            cuvinte.add(cuvant);
        }
        // Closing Scanner after the use
        scan.close();

        System.out.println("Toate cuvintele introduse sunt: " + cuvinte);
    }


    // EXERCITIU: 2
    // se citeste un numar N de la tastatura
    // se introduc de la tastatura N cuvinte, dar acestea trebuie sa fie unice ca sa fie acceptate
    // programul nu va trece mai departe pana nu se accepta un cuvant
    // sa se printeze cuvintele care au fost acceptate in lista
    public static void exercitiu2()
    {
        List<String> cuvinte = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int numar = citesteNrTastatura(scan);


        for (int i = 1; i <= numar; i++)
        {
            System.out.print("Introduce cuvantul " + i +  ": " );
            String cuvant = scan.next();

            if ( cuvinte.indexOf(cuvant) == -1)
            {
                cuvinte.add(cuvant);
            }
            else
            {
                i--;
                System.out.println("Cuvantul introdus exista deja in lista. Adauga un cuvant nou!");
            }

        }
        // Closing Scanner after the use
        scan.close();

        System.out.println("Lista de cuvinte este: " + cuvinte);

    }


    // EXERCITIU: 3
    // se citeste un numar N de la tastatura -----
    // se introduc de la tastatura N numere intregi ----
    // se creaza 2 liste, una pentru numere pare si una pentru impare -------
    // in timp ce se citesc numerele, acestea se vor introduce in lista in care se potrivesc ----
    // sa se afiseze cele 2 liste la sfarsit
    public static void exercitiu3()
    {
        List<Integer> nrPare = new ArrayList<>();
        List<Integer> nrImpare = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int numar = citesteNrTastatura(scan);


        for (int i = 1; i <= numar; i++)
        {
            System.out.print("Introduce numarul " + i + " : ");
            int numarX = scan.nextInt();

            if (numarX % 2 == 0)
            {
                nrPare.add(numarX);
            }
            else
            {
                nrImpare.add(numarX);
            }
        }

        System.out.println("Lista cu numerele pare este: " + nrPare);
        System.out.println("Lista cu numerele impare este: " + nrImpare);

        // Closing Scanner after the use
        scan.close();

    }




    public static void main(String[] args)
    {
        // exercitiu1();
        // exercitiu2();
        exercitiu3();

    }
}
