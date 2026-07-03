import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // System.out.print("Enter your name : ");
        // String x = sc.next();

        // if(x.toLowerCase().equals("vishwa")){
        //     System.out.println("Tameez seekho !");
        // }else{
        //     System.out.println("Ye to mast hai!");
        // }


        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num%2==0) System.out.println("Even number");
        else if(num%2==1) System.out.println("Odd number");
        else System.out.println("Zero");

        sc.close();
    }
}

// ternerary operator is used for short assignments :

// result = n%2==0 ? 10 : 20;    -> condition ? if true then execute this : if not true execute this part ;

