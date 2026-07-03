// abstract class A
// {
//     public abstract void show();
// }


// public class New {
//     public static void main(String[] args) {
//         A obj = new A(){
//             public void show(){
//                 System.out.println("Hello");
//             }
//         };
//         obj.show(); 
//     }
// }

// instead of creating a class with all abstract methods we can create a interface .




// blueprint for classes 
// all the methods inside interface are final and static .
// all the properties are by default final and static .

interface A
{
    int age = 10;
    int area = 45;

    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("show");
    }

    public void config(){
        System.out.println("config");
    }
}




public class New {
    public static void main(String[] args) {
       A obj = new B();
       obj.show();
       obj.config();
       System.out.println(A.area);
    }
}