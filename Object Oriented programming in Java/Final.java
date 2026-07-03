class Cal{ // making a class final makes it impossible to be inherited
    public final void show(){
        System.out.println("in cal show");
    }
    public void add(int a , int b){
        System.out.println(a + b);
    }
}

// class AdvCalc extends Cal{
//     public void show(){ -> final keyword stops any method from being overridden
//         System.out.println("in advcal show");
//     }
// }


public class Final {
    public static void main(String[] args) {
        // final int num = 8; // final variable -?> makings it constant
        // // num = 9;
        // System.out.println(num);

        // AdvCalc obj = new AdvCalc();
        // obj.show();
        // obj.add(4,5);

    }
}
