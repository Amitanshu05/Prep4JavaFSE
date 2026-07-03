// Object -> has properties and behaviour.
// class is like a blueprint which we create and give to the jvm which creates object based on the class.



// public class OOPS {
//     public static void main(String[] args) {
//         int num1 = 4;
//         int num2 = 5;

//         int result = num1 + num2;
//         System.out.println(result);
//     }
// }



// class Calculator{
//     int a;

//     public int add(int n1 , int n2)
//     {
//         int r = n1 + n2;
//         return r;
//     }
// }



// public class OOPS {
//     public static void main(String[] args) {
//         int num1 = 4;
//         int num2 = 5;

//         // int result = num1+num2;
//         // calc is reference variable.

//         Calculator calc = new Calculator();
//         int result = calc.add(num1,num2);

//         System.out.println(result);
        
//     }
// }


// class Computer
// {
//    public void playMusic()
//    {
//        System.out.println("Music Playing !!");
//    }

//    public String getMeAPen(int cost)
//    {   
//       if( cost>10)
//         return "Pen"; 
//       else 
//         return "Nothing";  
//    }

// }

// public class OOPS {
//     public static void main(String[] args) 
//     {
//         Computer comp = new Computer();
//         comp.playMusic();
//         String str = comp.getMeAPen(13);
//         System.out.println(str);
//     }
// }

// if we want two functions of the same name then they must have different parameters i.e the number of parameters must be different or the return type of the method must be different.

// method overloading.
class Calculator{
    public int add(int n1 , int n2){
        return n1 + n2;
    }

    public int add(int n1 ,int n2 ,int n3){
        return n1 + n2 + n3;
    }

    public double add(double d1 , double d2){
        return d1 + d2 ;
    }
}



public class OOPS {
    public static void main(String args[]){

        int num1 = 99;
        int num2 = 123;
        int num3 = 3434;

        Calculator cal = new Calculator();
        int result = cal.add(num1,num2,num3);
        System.out.println(result);
             

    }
}


// JVM : 

//    it has 2 type of memory :
//    stack memory and heap memory . stack is last in first out and heap is expandable memory . every method has its own stack memory.
// local variables are part of stack memory and instantaneous variables are part of heap memory.


