package C7_OOP;

public class PassByValueAnByReference
{
    public static void f1(int x)
    {
        System.out.println("x=" + x);
        x = x + 5;
        System.out.println("x=" + x);
    }

    public static void f2(MyClass x)
    {
        System.out.println("y=" + x.y);
        x.y = x.y + 5;
        System.out.println("y=" + x.y);
    }

    public static void main(String[] args)
    {
        // pass by value
        int a = 10;
        a = 10;
        f1(a);
        System.out.println("a=" + a);


        System.out.println();
        System.out.println();

        //----------------------------------------

        // pass reference by value
        MyClass b = new MyClass(40,2);
        // b.y = 10;
        f2(b);
        System.out.println("b.y=" + b.y);
    }
}
