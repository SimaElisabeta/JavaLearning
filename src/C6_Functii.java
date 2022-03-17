public class C6_Functii
{
    // functie/metoda = logica delimitata care poate fi refolosita -
    // logica poate fi scrisa intr-un loc si se poate refolosi cand e nevoie sa fie accesata
    // REGULI LA FUNCTII:
    // 1. nu putem folosi spatii in nume
    // 2. nu putem defini o functie in alta functie (nu pot instala firefox in chrome)

    // public static void =>
    // *public = o putem accesa de oriunde/ putem accesa din orice clasa;
    // *static = nu este in contextul programarii bazate pe obiect;
    // *void = nu ne da nici un raspuns/ nu returneaza nimic


    // EXEMPLU 1:
    // o functie simpla care ne printeaza ceva pe ecran si nu returneaza
    // nu ne da nici un raspuns (nu are retunr/ nu returneaza)
    // nu are parametri
    public static void prinGreeting()
    {
        System.out.println("Buna ziua! Bine ati venit");
    }


    // EXEMPLU 2:
    // o functie care saluta clientul in functie de numele lui
    // nu ne da nici un raspuns (nu are retunr/ nu returneaza)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume)
    {
        System.out.println("Buna ziua! " + nume + " " + prenume + ". Bine ati venit");
    }


    // EXEMPLU 3:
    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma numerelor, va avea return (o functie returneaza)
    // ce tip de date va avea raspunsul? 3 + 5 = 8 => int
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c)
    {
        // double media = (a + b + c) / 3; // Nu este neaparat nevoie sa punem linia asta de cod, putem declara direct return = ecuatia
        // return media;
        return (a + b + c) / 3;
    }


    // EXEMPLU 4:
    // o functie care ne da valoarea lui pi
    // ne da un raspuns
    // raspunsul va fi double
    // nu are nevoie de parametri
    public static double piValue()
    {
        // constanta  - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }



    public static void main(String[] args)
    {
        // EXEMPLU 1:
        // intra clientul 1
        prinGreeting(); // se apeleaza fuctia!

        // intra clientul 2
        prinGreeting(); // CTRL + Click pe functie => ne duce la corpul ei
        System.out.println();


        // EXEMPLU 2:
        // apelam o functie cu parametrii, oferind argumente
        printGreetingByName("Sima", "Elisabeta");
        printGreetingByName("Varga", "Lorand");
        System.out.println();


        // EXEMPLU 3:
        System.out.println(mediaNr(3, 3, 5));
        double media1 = mediaNr(3131,244545,114);
        double media2 = mediaNr(234,1501,55);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println();

        // EXEMPLU 4:
        System.out.println(piValue());


        // tema:
        // aria unui dreptunghi
        // aria cercului
        // suma a 2 numere
        // o functie care returneaza cate caractere are numele + prenumele

        // tema:
        // avand 3 numere, returnati pe cel mai mare

    }
}
