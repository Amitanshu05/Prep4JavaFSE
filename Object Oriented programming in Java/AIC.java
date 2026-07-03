class A
{
    public void dummy()
    {
        System.out.println("dummy text is here ");
    }

}

// class B extends A
// {
//     public void dummy()
//     {
//         System.out.println("different dummy text is here ");
//     }
// }


public class AIC
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void dummy()
            {
                System.out.println("Abstract dummy text is here ");
            }
        };
        obj.dummy();
    }
}
 // bina ek new class banaye seedha anaonymous inner class bana do so that new implementation likh ske hum usme.