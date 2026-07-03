class Mobile{
    String brand;
    int price;
    static String name;


    static{
        name = "Phone";
        System.out.println("in static");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
        // name = "Phone"; // everytime new object create hoga to name bhi initialise ho jayega .

    }

}

public class static3 {

    public static void main(String[] args) throws ClassNotFoundException {


        Class.forName("Mobile"); // loading the class in jvm memory . it will execute the static part as well. 
        
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "Smartphone";

        // Mobile obj2 = new Mobile();


    }

}