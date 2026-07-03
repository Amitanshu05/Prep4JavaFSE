// // # Java Inheritance: Upcasting vs Downcasting Notes

// // ## 1. The Concept (Reference vs Object)
// // - Reference Type: Batata hai ki aap kya access kar sakte ho (Compiler point of view).
// // - Actual Object: Memory mein jo object bana hai, wahi asal "takat" hai (Runtime point of view).

// // Example Setup:
// class Animal {}
// class Dog extends Animal {}

// ---

// // ## 2. Upcasting (Child -> Parent)
// // - Definition: Child object ko Parent reference mein store karna.
// // - Nature: Automatic, Safe.
// // - Logic: Har Dog ek Animal hai, isliye safe hai.

// // Code:
// Animal a = new Dog();

// // - Rule: Aap sirf wahi methods access kar sakte ho jo 'Animal' class mein define hain. Dog ke extra methods call nahi kar sakte.

// // ---

// // ## 3. Downcasting (Parent -> Child)
// // - Definition: Parent reference ko wapas Child reference mein convert karna.
// // - Nature: Manual, Risky (Needs explicit casting).
// // - Logic: Har Animal ek Dog nahi hota, isliye developer ko batana padta hai.

// // Code:
// Animal a = new Dog(); // Upcasted
// Dog d = (Dog) a;      // Downcasted (Explicit)

// // - Danger: Agar object asal mein Dog nahi hai, toh `ClassCastException` (Runtime Error) aayega.

// // ---

// // ## 4. Best Practice (Safe Downcasting)
// // Hamesha 'instanceof' ka check lagao:

// if (a instanceof Dog) {
//     Dog d = (Dog) a;
//     // Now perform Dog specific operations
// } else {
//     System.out.println("Object is not a Dog!");
// }

// // ---

// // ## Summary Table
// // | Feature | Upcasting | Downcasting |
// // | :--- | :--- | :--- |
// // | Direction | Child to Parent | Parent to Child |
// // | Syntax | Implicit (Automatic) | Explicit (Manual) |
// // | Safety | Always Safe | Risky (Runtime Error risk) |




// public class Casting {
    
// }
