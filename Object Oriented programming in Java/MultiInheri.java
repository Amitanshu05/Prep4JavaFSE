// multiple inheritence is not supported by java and yeah there is ambiquity there .

// Hamne without even creating object for A jab code run kara to constructor A ka bhi call ho gya apne aap hi because .

// every class in java extends to Object class hence super in the A class constructor too.
class A
{

    public A(){
        super();
        System.out.println("In A");
    }

    public A(int N){
        super();
        System.out.println("In A int");
    }
   
}

class B extends A
{

    public B(){
        // super();  -> by default hota hai as the first statement of a constructer and it calls the default constructor of its super class.
        super();
        System.out.println("In B");
    }

    public B(int M){
        this(); // this method executes the constructor of the same class and super executes the constructor of its parent class .
        // super(M);
        System.out.println("In B int");
    }

}


public class MultiInheri {
    public static void main(String[] args) {
        // B obj = new B();
    }
}
