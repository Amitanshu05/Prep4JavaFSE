/*
=======================================================================
🔥 CORE JAVA NOTES: STRING, SCP, AND IMMUTABILITY (INTERVIEW TRAPS)
=======================================================================

1. THE SCP (String Constant Pool) MAGIC:
   String name1 = "amitanshu"; 
   String name2 = "amitanshu"; 
   - 'name1' banate hi Heap ke SCP area mein "amitanshu" store ho gaya.
   - 'name2' ke liye Java naya object nahi banayega, SCP check karega aur 
     'name2' ko bhi purane wale address par hi point karwa dega. Memory saved!

2. IMMUTABILITY (The Modification Trap):
   name1 = name1 + " hello";
   - Strings IMMUTABLE hote hain (change nahi ho sakte).
   - Java ek NAYA object banayega "amitanshu hello" kisi naye address par.
   - IMP: Purana "amitanshu" remove/delete NAHI hota, wo SCP mein pada 
     rehta hai. (Isliye heavy modification wale loops mein String ki jagah 
     StringBuilder ya StringBuffer use karna chahiye to avoid memory bloat).

3. THE 'new' KEYWORD DIFFERENCE:
   String name3 = new String("amitanshu");
   - 'new' keyword se object directly normal Heap memory mein banta hai, 
     SCP mein nahi. Iska address completely alag hoga.

4. THE ULTIMATE KBA TRAP (== vs .equals):
   System.out.println(name1 == name2);      // TRUE (Dono ka address same hai)
   System.out.println(name1 == name3);      // FALSE (Address alag hain - SCP vs Heap)
   System.out.println(name1.equals(name3)); // TRUE (.equals() sirf content check karta hai)

=======================================================================
*/



public class A2 {
    public static void main(String[] args) {
        
        // String name = new String("Navin");
        // String name2 = "Amitanshu";
        // System.out.println("Hello " + name);
        // System.out.println(name.charAt(3));
        // System.out.println(name.concat("Amitanshu"));
        
    }
}
