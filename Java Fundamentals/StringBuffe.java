public class StringBuffe {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Amitanshu ");
        System.out.println(sb.capacity()); // 16 + 9
        System.out.println(sb.length());

        System.out.println(sb.append("hello"));
        System.out.println(sb.deleteCharAt(0));
    }
}

/*
=======================================================================
🔥 CORE JAVA NOTES: StringBuffer vs StringBuilder
=======================================================================
1. BOTH ARE MUTABLE: Dono memory mein string modify kar sakte hain bina naya 
   object banaye. (e.g., sb.append(" hello") purane block mein hi add hoga).

2. THE MAIN DIFFERENCE:
   - StringBuffer : Synchronized (Thread-safe), SLOW. 
   - StringBuilder: Non-Synchronized (Not thread-safe), FAST. 

3. BEST PRACTICE: 
   Hamesha StringBuilder use karo jab tak specifically multithreaded 
   environment mein string sharing na ho.

4. INTERVIEW TRAP (.equals behavior):
   StringBuilder sb1 = new StringBuilder("amitanshu");
   StringBuilder sb2 = new StringBuilder("amitanshu");
   
   System.out.println(sb1 == sb2);      // FALSE (Address alag hai)
   System.out.println(sb1.equals(sb2)); // FALSE 🚨 (Does NOT check content, only checks address)
   
   // FIX for comparison:
   System.out.println(sb1.toString().equals(sb2.toString())); // TRUE
=======================================================================
*/