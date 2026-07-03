// everytime we print the obj , it automatically calls obj.toString() method .

// In Java, a hashcode is an integer value returned by the hashCode() method,
// which is defined in the root Object class. It acts as a numeric
// representation of an object and is primarily used to efficiently store,
// group, and retrieve data in hash-based collections



class Laptop{
    int price;
    String model;


    public String toString(){
        return price + " : " + model;
    }

    public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price == that.price) return true;
        else return false;
    }
}


public class J1 {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Inspiron 14";
        obj.price = 140000;
        // System.out.println(obj);

        Laptop obj2 = new Laptop();
        obj2.model = "Inspiron 15";
        obj2.price = 142000;

        boolean result = obj.equals(obj2);
        System.out.println(result);
    }
}




/**
 * ============================================================================
 * TOPIC: WRAPPER CLASSES, AUTOBOXING & AUTO-UNBOXING IN JAVA
 * ============================================================================
 * * CORE QUESTION: Primitive data types (int, double) पहले से ही fast हैं, 
 * तो उन्हें Object (Integer, Double) में क्यों बदलें?
 * * AUTHOR: AI Collaborator
 * DATE: 2026
 * ============================================================================
 */

// import java.util.ArrayList;

// public class AutoboxingNotes {

//     public static void main(String[] args) {
        
//         // --------------------------------------------------------------------
//         // BREAKDOWN 1: WHAT IS AUTOBOXING & UNBOXING?
//         // --------------------------------------------------------------------
        
//         int primitiveNum = 10;
        
//         // Autoboxing: Primitive -> Object (Automatic conversion by Java)
//         Integer objectNum = primitiveNum; 
//         // Behind the scenes: Integer.valueOf(primitiveNum);

//         // Auto-unboxing: Object -> Primitive (Automatic conversion)
//         int anotherPrimitive = objectNum; 
//         // Behind the scenes: objectNum.intValue();


//         // --------------------------------------------------------------------
//         // BREAKDOWN 2: REAL USE CASES (हम ऐसा क्यों करते हैं?)
//         // --------------------------------------------------------------------

//         /*
//          * USE CASE 1: Java Collections Framework
//          * Collections (ArrayList, HashMap, HashSet) सिर्फ Objects को सपोर्ट करते हैं।
//          * वे primitive types को स्टोर नहीं कर सकते।
//          */
        
//         // ArrayList<int> list = new ArrayList<int>(); // ❌ COMPILE ERROR!
//         ArrayList<Integer> numberList = new ArrayList<>(); //  VALID!
        
//         // यहाँ Autoboxing के कारण हम सीधे primitive int पास कर पा रहे हैं:
//         numberList.add(5);  // Java automatically converts 5 (int) to Integer.valueOf(5)
//         numberList.add(25);


//         /*
//          * USE CASE 2: Handling Null Values (Real-world Data/Database)
//          * Primitives की हमेशा डिफ़ॉल्ट वैल्यू होती है (int = 0). वे null नहीं हो सकते।
//          * Wrapper Objects 'null' हो सकते हैं, जो "Data Missing" को दर्शाता है।
//          */
        
//         int agePrimitive = 0; // क्या उम्र सच में 0 है, या यूज़र ने फॉर्म खाली छोड़ा? (Ambiguity)
//         Integer ageObject = null; // साफ़ मतलब है: यूज़र ने अभी तक अपनी Age नहीं बताई है।


//         /*
//          * USE CASE 3: Generics and OOPs Compliance
//          * Java एक OOP language है। कई जेनेरिक मेथड्स को काम करने के लिए Objects चाहिए होते हैं।
//          * Wrapper classes primitives को ऑब्जेक्ट का रूप देकर OOPs का हिस्सा बनाती हैं।
//          */


//         /*
//          * USE CASE 4: Inbuilt Utility Methods
//          * Wrapper classes के पास बहुत सारे रेडीमेड हेल्पर मेथड्स होते हैं।
//          */
//         String numberString = "456";
//         // String को int में बदलना:
//         int convertedValue = Integer.parseInt(numberString); 
        
//         // Binary string में बदलना:
//         String binaryStr = Integer.toBinaryString(10); // Result: "1010"
        
//         // Max/Min limits पता करना:
//         int maxLimit = Integer.MAX_VALUE; // 2147483647


//         // --------------------------------------------------------------------
//         // QUICK SUMMARY & BEST PRACTICE
//         // --------------------------------------------------------------------
//         /*
//          * +------------------+-------------------+----------------------------+
//          * | Feature          | Primitive (int)   | Wrapper Object (Integer)   |
//          * +------------------+-------------------+----------------------------+
//          * | Memory & Speed   | Extremely Fast    | Heavier (Object Overhead)  |
//          * | Collections      | Not Allowed ❌     | Allowed                    |
//          * | Null Support     | No ❌             | Yes                        |
//          * +------------------+-------------------+----------------------------+
//          * * RULE OF THUMB:
//          * 1. आम कैलकुलेशन, लूप्स (Loops) और लोकल वेरिएबल्स के लिए हमेशा 'primitive' यूज़ करें।
//          * 2. Collections, Generics, या API/Database Interaction (जहाँ null की ज़रुरत हो) 
//          * के लिए 'Wrapper Objects' का यूज़ करें।
//          */

//          System.out.println("Notes loaded successfully! Press Ctrl+F to search topics inside VS Code.");
//     }
// }