import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C5_ExercitiiFor
{
    public static void main(String[] args)
    {
        // EXERCITIU 1: se da o lista, array. [7, 10, 1, 3, 17, 20, 100, 27, 30, 43]
        // printeaza cate elemente sunt divizibile cu 3 si cu 5... 2 printuri

        int[] numere = {7, 10, 1, 3, 17, 20, 100, 27, 30, 43};

        /*

        int contor3 = 0;
        int contor5 = 0;

        for (int i = 0; i < numere.length; i++)
        {
            int element = numere[i];

            if ((element % 3) == 0)
            {
                System.out.println("divizibil cu 3: " + element);
                contor3 = contor3 + 1;
            }
            if ((element % 5) == 0)
            {
                System.out.println("divizibil cu 5: " + element);
                contor5 = contor5 + 1;
            }
        }

        System.out.println("total numere divizibile cu 3: " + contor3);
        System.out.println("total numere divizibile cu 5: " + contor5);

        */



        // EXERCITIU 2:
        // afla media aritmetica [7, 10, 1, 3, 17, 20, 100, 27, 30, 43]

        /*

        int suma = 0;

        for (int numar : numere)
        {
            suma = suma + numar;

        }
        System.out.println("Suma este: " + suma);
        System.out.println("Lungimea la care trebuie sa impartim suma este: " + numere.length);
        float medAritmetica = (float)suma / numere.length;
        System.out.println("Media aritmetica este:" + medAritmetica);

        */



        // EXERCITIU 3:
        // afla care este cel mai mare numar din lista/array [7, 10, 1, 3, 17, 20, 100, 27, 30, 43]

        /*
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numere.length; i++)
        {
            System.out.println(numere[i]);
            if (numere[i] > max)
            {
                max = numere[i];
                System.out.println("Am gasit un maxim nou: " + max);
            }
        }
        System.out.println("Numarul cel mai mare este: " + max);
        System.out.println();
        */



        // EXERCITIU 4:
        // afla care este cel mai mic numar din lista/array [7, 10, 1, 3, 17, 20, 100, 27, 30, 43]

        /*

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numere.length; i++)
        {
            System.out.println(numere[i]);
            if (numere[i] < min)
            {
                min = numere[i];
                System.out.println("Am gasit un minim nou: " + min);
            }
        }
        System.out.println("Numarul cel mai mic este: " + min);
        */



        // EXERCITIU 5:
        // folosind o bucla for calculeaza cate numere sunt divizibile cu 3 intre 1 - 10000

        /*
        int counter = 0;
        for (int i = 1; i <=10000; i++)
        {
            if ((i % 3) == 0)
            {
                counter = counter + 1;
            }
        }
        System.out.println("Totalul de numere divizibile cu 3 sunt: " + counter);
        */




        // EXERCITIU 6:
        // se dau 2 array de stringuri, printeaza toate combinatiile din continutul celor 2 array-uri


        /*
        String[] substantive = {"minge", "farfurie", "lampa", "masa"};
        String[] adjective = {"mare", "frumoasa", "preferata"};

        for (String substantiv : substantive)
        {
            for (String adjectiv : adjective)
            {
                System.out.println(substantiv + " " + adjectiv);
            }
        }
        */



        // EXERCITIU 7:
        // se da un array de stringuri cu litere mici, parcurge array-ul si inlocuieste stringurile cu echivalentul lor cu litere mari

        // List<String> alfabet = Arrays.asList(new String[]{"Aa", "Bb", "Cc", "Dd", "Ee"});

        List<String> cuvinte = Arrays.asList(new String[]{"scaun", "masa", "birou", "canapea"});

        for (int x = 0; x < cuvinte.size(); x++)
        {
            String cuvantUp = cuvinte.get(x).toUpperCase();
            // System.out.println(cuvantUp);
            cuvinte.set(x, cuvantUp);
        }


        for (String cuvant : cuvinte)
        {
            System.out.println(cuvant);
        }

        // EXERCITIU :
        // pentru lista de mai sus sa se afiseze elementele in ordine inversa

        for (int a = cuvinte.size() - 1; a >= 0; a-- )
        {
            System.out.println(cuvinte.get(a));
        }
        System.out.println();


        // EXERCITIU 8:
        // din array-ul de stringuri sa se afiseze elementele in ordine inversa
        /*
        String[] substantive = {"minge", "farfurie", "lampa", "masa"};
        for (int c = substantive.length - 1; c >= 0; c-- )
        {
            System.out.println(substantive[c]);
        }
        System.out.println();
        */

        // EXERCITIU 9:
        // din array-ul de stringuri sa se afiseze fiecare a 2-a valoare

        String[] planete = {"mercur", "venus", "pamant", "marte", "jupiter", "saturn", "uranus", "neptun"};
        for (int p = 0; p < planete.length; p+=2)
        {
            System.out.println(planete[p]);
        }
        System.out.println();


        String[] substantive = {"minge", "farfurie", "lampa", "masa"};
        String[] adjective = {"mare", "frumoasa", "preferata"};

        for (int i=0; i < adjective.length; i+=1)
        {
            for (int z=0; z < substantive.length; z+=1)
            {
                System.out.println(substantive[z] + " " + adjective[i]);
            }
        }
        System.out.println();

        // EXERCITIU :
        // se citeste un nr de la tastatura, sa i se afiseze toti divizorii
        // ( a este divizibil cu b daca restul impartirii lui a la b = 0) a % b == 0

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numar: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        System.out.println("Ai introdus numarul: " + num);
        System.out.println("Divizorii numarului sunt:" );
        for (int div = 2; div < num; div++ )
        {
           if (num % div == 0)
           {
               System.out.println(div);
           }
        }


        // EXERCITIU :
        // printeaza toate numerele prime intre 2 - 100 - nu e divizibil cu alt numar decat cu 1 si cu el insusi
        for (int numar = 2; numar <= 100; numar += 1)
        {
            int count = 0;
            System.out.print(numar + ": ");
            for (int div = 2; div < numar; div++)
            {
                System.out.print(div + " ");
                if (numar % div == 0)
                {
                    count++;
                }
            }
             if (count == 0)
             {
                 // System.out.println("Numarul: " + numar + " este prim");
             }

            System.out.println();

        }

    }
}
