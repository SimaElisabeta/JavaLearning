public class C2_DataTypes
{
    public static void main(String[] args)
    {
        // cele mai folosite 5 tipuri de date - in Java

        // String = sir de caractere delimitate de "" - in Java
        String marcaMasina = "Dacia";
        String modelMasina = "1310";

        // .toUpperCase() modifica textul si il face cu litere mari
        System.out.println("Marca masinii si modelul sunt: " + marcaMasina.toUpperCase() + " " + modelMasina);
        // .length() calculeaza nr de caractere din variabila
        System.out.println("Asadar marca masinii contine " + marcaMasina.length() + " litere" + " si modelul masinii contine " + modelMasina.length() + " cifre");

        // integer = numar integ, int - in Java
        int anFabricatie = 1994;
        int anPePiata = 1995;

        System.out.println("An fabricatie al masinii este: " + anFabricatie);
        System.out.println("An pe piata al masinii este: " + anPePiata);


        // double/float = numar zecimal/numar cu virgula - in Java
        double pret = 1500.5;


        // boolean = adevarat sau fals - in Java
        boolean inmatriculata = true;


        // char = un singur character: #, $, 2, d. Delimitate de '' - in Java
        char nota = 'A';

    }
}
