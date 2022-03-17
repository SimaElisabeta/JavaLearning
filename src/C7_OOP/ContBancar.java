package C7_OOP;

public class ContBancar
{
    // program files = definim logica unui cont bancar

    // oop = object oriented programing (in RO: poo - programare orientata pe obiecte)

    // o clasa = este un tip nou
    // este definitia unui concept
    // ex: reteta la paste carbonara
    // ex: ADN-ul uman
    // ex: clasa Car

    // un obiect = instanta unei clase
    // ex: paste carbonara
    // ex: un om
    // ex: 10 obiecte de tip Car

    // fields = proprieteti = atribute


    // sunt variabile
    // ex: culoare, marca, model, consum, pret

    // metode = actiuni ce pot fi facute de obiecte
    // sunt funcii
    // ex: accelereaza(), franzeaza(), deschideUsa(), vopsire()



    // fields - proprietetile
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercariActivare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required fields
    public ContBancar(String titularCont, String iban)
    {
        this.titularCont = titularCont;
        this.iban = iban;
    }


    // metode = sunt actiunile clasei
    public void interogareSold()
    {
        System.out.println("Titular: " + this.titularCont);
        System.out.println("IBAN: " + this.iban);
        System.out.println("Sold: " + this.sold);
        System.out.println("Activ: " + this.activ);
        System.out.println("Nr de incarcari gresite: " + this.incercariActivare);
        System.out.println("-------------------");
    }

    public void activareCont(int pinUtilizator)
    {
        // modifica activ in true doar daca pinul este corect
        System.out.println("Buna " + this.titularCont);
        if (pinUtilizator == this.pin)
        {
            System.out.println("Card activat cu succes!");
            this.activ = true;
        }
        else
        {
            System.out.println("PIN gresit");
            this.incercariActivare++; // se incrementeaza
        }
    }

    public void alimentareCont(double sumaDepusa)
    {
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + sumaDepusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu succes in cont suma de: " + sumaDepusa + " .Soldul actual al contului este de: " + this.sold);
    }

    public void plataCard(double sumaCheltuita)
    {
        System.out.println("Buna " + this.titularCont);
        // pot sa cheltuiesc doar ce am
        // daca suma cheltuita este <= sold
        if (sumaCheltuita <= this.sold)
        {
            // atunci dispar banii din cond
            this.sold = this.sold - sumaCheltuita;
            System.out.println("Ai cheltuit " + sumaCheltuita);
            System.out.println("Soldul tau este de: " +this.sold);
        }
        else
        {
            System.out.println("Fonduri insuficiente!");
        }
    }




    // la curs: cei 4 piloni ai OOP sunt:!!!
    // inheritance
    // polimorphism
    // encapsulation
    // abstractization





}
