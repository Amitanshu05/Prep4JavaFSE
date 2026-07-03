// File Name: Polymorphism.java

/**
 * ==========================================
 * 🎯 POLYMORPHISM (Bahuroopiya) NOTES 🎯
 * ==========================================
 * * Poly = Many, Morph = Forms.
 * Ek hi action ka alag-alag objects ke hisaab se alag-alag tarike se hona.
 * * Types of Polymorphism:
 * * 1. Compile-Time Polymorphism (Method Overloading)
 * - Same method name, but different parameters (arguments).
 * - Compiler pehle se janta hai kaunsa method call hoga based on arguments.
 * - Example: attack() vs attack(String target)
 * * 2. Run-Time Polymorphism (Method Overriding & Dynamic Method Dispatch)
 * - Parent aur Child class mein exactly same method signature hota hai.
 * - Reference Parent ka, Object Child ka (Upcasting).
 * - JVM run-time par decide karta hai ki method actual Object ka chalega.
 * * ==========================================
 */

// --- PARENT CLASS ---
class Soldier {
    public void attack() {
        System.out.println("Generic Soldier: Attacking with basic rifle!");
    }
}

// --- CHILD CLASS 1 (Sniper) ---
class Sniper extends Soldier {
    
    // 1. RUN-TIME POLYMORPHISM (Overriding)
    @Override
    public void attack() {
        System.out.println("Sniper: Taking a silent headshot from 1000 meters. 🎯");
    }

    // 2. COMPILE-TIME POLYMORPHISM (Overloading)
    // Naam same hai, par parameter daal diya.
    public void attack(String targetName) {
        System.out.println("Sniper: Locking laser on high-value target -> " + targetName + " 🔴");
    }
}

// --- CHILD CLASS 2 (TankDriver) ---
class TankDriver extends Soldier {
    @Override
    public void attack() {
        System.out.println("Tank: Firing 120mm explosive shell. BOOM! 💥");
    }
}

// --- CHILD CLASS 3 (Medic) ---
class Medic extends Soldier {
    @Override
    public void attack() {
        System.out.println("Medic: I don't attack, I heal the squad! 💉");
    }
}

// ==========================================
// 🚀 MAIN CLASS (Entry Point)
// ==========================================
public class polymorphism {
    public static void main(String[] args) {

        System.out.println("--- 1. COMPILE-TIME POLYMORPHISM (Overloading) ---");
        Sniper ghost = new Sniper();
        ghost.attack();                 // Bina parameter wala chalega
        ghost.attack("Enemy General");  // String parameter wala chalega
        System.out.println();

        
        System.out.println("--- 2. TIGHTLY COUPLED (Rigid Approach) ---");
        // Yahan variable sirf TankDriver ko hold kar sakta hai. 
        // Kal ko Medic daalna ho toh error aayega.
        TankDriver t1 = new TankDriver();
        t1.attack();
        System.out.println();


        System.out.println("--- 3. LOOSELY COUPLED (Dynamic Method Dispatch / Upcasting) ---");
        // Parent ka Reference = Child ka Object
        // Ab 's1' flexible hai. Ye kisi bhi soldier ko hold kar sakta hai.
        Soldier s1 = new Sniper(); 
        s1.attack(); // Sniper wala attack chalega

        // Same variable ko reuse karke Tank bana diya! (Flexibility)
        s1 = new TankDriver(); 
        s1.attack(); // Tank wala attack chalega
        System.out.println();


        System.out.println("--- 4. THE MAGIC OF POLYMORPHIC ARRAYS ---");
        // Ek array jo sab type ke soldiers rakh sakti hai kyunki unka baap ek hi hai (Soldier).
        Soldier[] squad = new Soldier[3];
        
        squad[0] = new Sniper();
        squad[1] = new TankDriver();
        squad[2] = new Medic();

        // Commander ne bas ek loop chalaya aur bola "ATTACK!"
        // Har object apne apne style mein act karega (Run-Time Polymorphism).
        for(int i = 0; i < squad.length; i++) {
            System.out.print("Squad Member " + (i+1) + " Action: ");
            squad[i].attack();
        }
    }
}