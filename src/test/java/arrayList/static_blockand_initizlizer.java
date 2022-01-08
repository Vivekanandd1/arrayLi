package arrayList;

public class static_blockand_initizlizer {


    static int b;
    public static void show()
    {
        System.out.println("Static method");
    }
    static
    {
        b = 5;
        show();
    }
    public static void main(String arg[])
    {
        System.out.println("Main method");
    }
}
