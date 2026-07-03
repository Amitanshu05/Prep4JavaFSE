// class A
// {
//     int marks;
//     public void aslaah(){
//         System.out.println("Aslaah");
//     }

//     class B
//     {
//         public void zero(){
//             System.out.println("in zero");
//         }
//     }
// }

class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}


public class Inner_Class {
    public static void main(String[] args) {
        // A obj = new A();

        // A.B obj1 = obj.new B(); 
        // obj1.zero();

        A obj = new B();
        obj.show();

    }
}
