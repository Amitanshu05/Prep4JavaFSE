class Mobile {
    String brand;  // Instance (Har object ka apna)
    int price;     // Instance (Har object ka apna)
    
    // Static (Sabhi objects ke liye ek hi common memory)
    static String type = "Smartphone"; 

    public void show() {
        System.out.println(brand + " " + price + " " + type);
    }
}

public class StattticDemo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 300000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 30000;

        obj1.show(); // Output: Apple 300000 Smartphone
        obj2.show(); // Output: Samsung 30000 Smartphone

        System.out.println("--- JADUU (The Sync Effect) ---");
        
        // Kisi ek object ne nahi, balki CLASS ne type change kiya
        Mobile.type = "FeaturePhone"; 

        obj1.show(); // Output: Apple 300000 FeaturePhone
        obj2.show(); // Output: Samsung 30000 FeaturePhone
    }
}