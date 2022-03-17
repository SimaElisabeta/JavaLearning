
/*
Flow control:
if; else (evalueaza conditii si bifurca codul in functie de rezultat
 */


import java.util.Scanner;

public class C3_IfElse
{
    public static void main(String[] args)
    {
        // if
        System.out.println("1.exemplu if: EXERCITIU: radioul");// if
        // EXERCITIU: radioul
        // prin boolean invat calculatorul daca piesa e faina sau nu (adevarat/fals)
        boolean piesaFaina = true;

        System.out.println("pornim radioul");
            // daca imi place piesa, dau mai tare
        //if (piesaFaina == true)
        if (piesaFaina == true)
        {
            System.out.println("dau mai tare radioul");
            System.out.println("incep sa fredonez piesa");
        }
        System.out.println("oprim radioul");
        System.out.println(" ");



        // if else
        System.out.println("2. exemplu if else: EXERCITIU: par/impar + pozitiv"); // if else
        // EXERCITIU: daca nr este par printam acest lucru, altfel printam impar

        int nr = 4;

        if (nr % 2 == 0)
        {
            System.out.println("numarul este par");
        }
        else
        {
            System.out.println("numarul este impar");
        }

        if (nr > 0)
        {
            System.out.println("numarul este pozitiv");
        }
        else
        {
            System.out.println("numarul nu este pozitiv");
        }
        System.out.println(" ");


        // EXERCITIU: radioul, daca e ok muzica sau nu
        System.out.println("EXERCITIU: radioul cu else");

        // piesaFaina = false;
        System.out.println("Pornesc radioul");
        if (piesaFaina==true)
        {
            System.out.println("Imi place piesa asta");
            System.out.println("Incep sa fredonez");
            System.out.println("Acum trebuie sa plec, deci inchid radioul");
        }
        else
        {
            System.out.println("Nu imi place piesa");
            System.out.println("Inchid radioul");
        }
        System.out.println(" ");



        // if, else if, else (daca, altfel daca, altfel)
        System.out.println("3. exemplu if, else if, else: EXERCITIU: cum saluta robotelul");// if, else if, else
        // EXERCITIU: cum ne saluta robotelul in functie de ora?
        // 1. luam date de la tastatua - prin comanda: Scanner sc = new Scanner(System.in);
        // 2. creem variabila ora, ne asiguram ca folosim int! - prin comanda: sc.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu ora: ");
        int ora = sc.nextInt();

        if (ora < 0)
        {
            System.out.println("ora este invalida");
            System.out.println("introdu o ora intre 0-24");
        }
        else if (ora > 24)
        {
            System.out.println("ora este invalida");
            System.out.println("introdu o ora intre 0-24");
        }
        else if (ora < 12)
        {
            System.out.println("Buna dimineata!");
        }
        else if (ora <= 17)
        {
            System.out.println("Buna ziua!");
        }
        else if (ora <= 18)
        {
            System.out.println("Buna seara!");
        }
        else
        {
            System.out.println("Ne pare rau am inchis!");
        }

        // exercitiu viteza unei masini: daca viteza este 0- atunci stationeaza, daca este <= 50- atunci este in localitate etc.


        // flow control
        // switch - se foloseste cand stim valorile posibile (ca un fel de combobox cu variante specifice)

        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();

        switch (optiunea)
        {
            case 0:
                System.out.println("Ati revenit la meniul anterior");
                break;
            case 1:
                System.out.println("Ati ales limba Romana");
                break;
            case 2:
                System.out.println("Ati ales limba Engleza");
                break;
            default:
                System.out.println("Optiune invalida");
        }

    }

}
