class Mobile {
    String brand;  // Instance (Har object ka apna)
    int price;     // Instance (Har object ka apna)
    
    // Static (Sabhi objects ke liye ek hi common memory)
    static String type = "Smartphone"; 

    public void show()
    {
        System.out.println(brand + " " + price + " " + type);
    }

    public static void show1()
    {
        System.out.println("In static method ");
    }
}

public class StattticD {
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

/*
=======================================================================
🔥 CORE JAVA CHEAT SHEET: 'static' KEYWORD & MEMORY
=======================================================================

1. THE CORE FUNDA (Class-Level vs Object-Level)
   - 'static' means CLASS-LEVEL property. It belongs to the class, 
     not to any specific object.
   - Instance Variables: Har naye object ke paas apni personal copy 
     hoti hai (Stored in Heap Memory).
   - Static Variables: Sabhi objects ke beech sirf EK common copy 
     share hoti hai (Stored in Method Area / Metaspace).
   - Purpose: To save memory and maintain common data (e.g., Company Name).

2. HOW TO ACCESS
   - Hamesha Class ke naam se access karna standard practice hai.
   - Variable: Mobile.type = "Smartphone";
   - Method: Mobile.show1();

=======================================================================
🚨 GENC NEXT KBA & INTERVIEW TRAPS (MUST REMEMBER)
=======================================================================

TRAP 1: The Instance Access Rule
Question: Kya static method ke andar non-static (instance) variables 
          use ho sakte hain?
Answer: DIRECTLY NAHI. Kyunki static method class load hote hi memory 
        mein aa jata hai, tab tak objects bane bhi nahi hote. Usko 
        pata hi nahi hota ki instance variable kis object ka uthana hai.
(Note: 'this' aur 'super' keywords static method mein strictly ALLOWED NAHI hain).

TRAP 2: The Object-Pass Hack (The Ninja Technique)
Question: How can we indirectly access instance variables in a static method?
Answer: By explicitly passing the object reference as a parameter!
        public static void show1(Mobile obj) { 
            System.out.println(obj.brand); // ✅ THIS WORKS PERFECTLY!
        }

TRAP 3: "Why public static void main?"
Question: main() method hamesha static kyun hota hai?
Answer: Taaki Java ka engine (JVM) bina object banaye seedha program 
        ka execution start kar sake. Agar main() static nahi hota, toh 
        JVM ko pehle class ka object banana padta, jisse memory aur 
        execution ka deadlock lag jata.

=======================================================================
*/