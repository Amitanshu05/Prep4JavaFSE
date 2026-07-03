class A{

    public A(){
        System.out.println("object created");
    }
    
    public void show(){
        System.out.println("in A show");
    }

}

public class Main {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A obj;          -> reference variable declaration
        // obj = new A();  -> object creation 

        new A();   // anonymous object. (i cant use this object once more)
    }
    
}
