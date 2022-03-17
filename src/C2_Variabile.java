public class C2_Variabile
{

    public static void main(String[] args)
    {
        // strongly typed - trebuie sa specificam tipul de date
        // string = siruri de caractere

        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascriere variabila
        modelMasina = "XC 60 full option";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String nume;
        String prenume;
        int varsta;

        // initializare
        prenume = "Sima";
        nume = "Eli";
        varsta = 27;

        // concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta);
    }
}






