package C7_OOP;

public class ContBancarMain
{
    public static void main(String[] args)
    {
        // desktop

        // initializam obiecte de tip ContBancar - sunt instante ale unui ContBancar

        ContBancar cont1 = new ContBancar("Viorel C ", "RO001");
        ContBancar cont2 = new ContBancar("Nasa C ", "RO002");

        // apelam medota de descriere
        //cont1.descriere();
        //cont2.descriere();

        // activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(7777);

        // alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        // testari! <--
        // negative testing, cheltuim mai mult decat avem
        cont1.plataCard(500); // pass, expectet result: sold = 300.5

        // positive, cu suma exacta
        cont1.plataCard(300.5); // pass, expected result: sold = 0

        // positive de 2x
        cont2.plataCard(100);
        cont2.plataCard(200);
        // -->


        cont1.interogareSold();
        cont2.interogareSold();

    }
}
