public class C5_While
{
    public static void main(String[] args)
    {
        // while = loop sau un ciclu repetitiv (o zona de cod care se repeta atat timp cat o conditie este true)

        // EXERCITIU: masina merge cat timp inca are benzina
        System.out.println("EXERCITIU: masina merge cat timp inca are benzina");
        int litriBenzina = 5;
        while (litriBenzina > 0)
        {
            // accleram
            System.out.println("Vrumm, vrumm!");

            // scadem benzina
            litriBenzina = litriBenzina - 1;
            System.out.println("Ai ramas cu: " + litriBenzina + " litrii de benzina");

            // aprindem beculetul cand avem <= 3 litri
            if (litriBenzina <= 3)
            {
                System.out.println("Se aprinde becul rosu. Esti la limita cu benzina!");
                System.out.println("Alimenteaza cat mai repede");
            }
        }
        System.out.println("Stop! Nu mai avem benzina");



    }
}
