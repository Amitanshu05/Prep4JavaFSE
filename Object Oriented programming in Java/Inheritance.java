// there can be only 1 public class in a file which should have the same name as of the file name . in industry one class one file .
class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int sub(int n1 , int n2)
    {
        return n1 - n2;
    }
}

class advCalc extends Calc
{
    public int mul(int n1 , int n2)
    {
        return n1*n2;
    }

    public int div(int n1 , int n2)
    {
        return n1/n2;
    }
}

class scientificCalc extends advCalc
{
    public int power(int m1 , int m2)
    {
        return (int)(Math.pow(m1,m2));
    }
}

public class Inheritance 
{
    public static void main(String[]args)
    {

        Calc obj = new Calc();
        advCalc obj1 = new advCalc();
        scientificCalc obj2 = new scientificCalc();

        int r3 = obj1.add(14,7);
        int r4 = obj1.sub(133,2);

        int r1 = obj.add(4,7);
        int r2 = obj.sub(33,2);

        int r5 = obj2.add(33,2342342);

        System.out.println(r1 + " " + r2);
        System.out.println(r3 + " " + r4);
        System.out.println(r5);

    }
}

// single and multi level inheritence .