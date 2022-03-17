package OOP_Eli;

public class CorpMobilierMain
{
    public static void main(String[] args)
    {
        // initializam obiecte de tip CropMobilier - sunt instante ale unui CropMobilier

        // c1 e un obiect de tipul CorpMobilier
        // c1 e o instanta a clasei CorpMobilier
        // cand apelam new CorpMobilier(...)  ==> cream o instanta a clasei SAU instantiem clasa CorpMobilier
        CorpMobilier c1 = new CorpMobilier("Corp Turn","PAL",true,"Balamale");
        CorpMobilier c2 = new CorpMobilier("Corp Plita","PAL",true,"Sertare");
        CorpMobilier c3 = new CorpMobilier("Masca Chiuveta","PAL",true,"Balamale");
        CorpMobilier c4 = new CorpMobilier("Corp Deschis","PAL",false,"Fara accesorii");

        c1.caracteristiciMobilier();
        c2.caracteristiciMobilier();
        c3.caracteristiciMobilier();
        c4.caracteristiciMobilier();
    }
}
