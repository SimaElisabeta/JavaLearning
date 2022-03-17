package OOP_Eli;

public class CorpMobilier
{
    String denumireCorp;
    String materialCarcasa;
    boolean front;
    String materialFront;
    String accesoriiCorp;

    // constructorul clasei
    public CorpMobilier(String denumireCorp, String materialCarcasa, boolean front, String accesoriiCorp)
    {
        this.denumireCorp = denumireCorp;
        this.materialCarcasa = materialCarcasa;
        this.front = front;
        this.accesoriiCorp = accesoriiCorp;
    }

    public void caracteristiciMobilier()
    {
        System.out.println("Mobilierul este compus din: " + denumireCorp);
        System.out.print("Materialul carcasei este: " + materialCarcasa + ". ");

        if (front == true)
        {
            this.materialFront = "MDF";
            System.out.print("Materialul frontului este: " + materialFront + ". ");
            System.out.println("Frontul functioneaza cu: " + accesoriiCorp);
        }
        else
        {
            System.out.println("Copul este deschis si nu are front!" + accesoriiCorp);
        }

    }
}

