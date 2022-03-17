
// Recap:
/*
variabile
tipuri de date: string, int, float/double, boolean, char
*/

// Operatori:
/*
artitmetici: +, -, *, /, % (modulo-doar pentru nr intregi=rest)
de comparare < >, == (egal), != (diferit), >=, <=
logici: && (and/si), || (or/sau), ! (not/inverseaza)
*/





public class C3_Operatori
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = 5;
        a = b;


        // Operatori de comparare:
        // System.out.println(a == b); // a este egal cu b? => true
        // System.out.println(6 > b); // 6 este mai mare ca b? => true
        // System.out.println(6 < b); // 6 este mai mic ca b? => false
        // System.out.println(a != b); // a este diferit ca b? => false

        // Operatori logici:
        // System.out.println(7>b && 8>b); // &&=si // in acelasi timp 7-este mai mare decat-b si 8-este mai mare decat-b => doar daca ambele sunt adevarate atunci rezultatul va fi true in rest va fi fals
        // System.out.println(4>b && 4>b); // &&=si // avem nevoie doar de o valoare falsa si atunci rezultatul va fi fals
        // System.out.println(4>b || 3>b); // ||=sau // 4 este mai mare ca b? => false |ori| 3 este mai mare ca b? => false => doar daca ambele valori sunt false atunci rezultatul va fi false
        // System.out.println(4>b || 6>b); // ||=sau // 4 este mai mare ca b? => false |ori| 6 este mai mare ca b? => true => avem nevoie doar de o valoare adevarata si atunci rezultatul va fi true
        // System.out.println(7>b && (2>b || 3>b)); // true && false => false
        // System.out.println(7>b || (2>b || 3>b)); // true && false => true
        // System.out.println(!(7>b)); // !true => false
        System.out.println(!true); // !true => false

    }

}
