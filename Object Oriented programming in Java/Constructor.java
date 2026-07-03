class Human
{
    private int age;
    private String name;

    public Human()   // default constructor 
    {
        age = 12;
        name = "Rohan";
    }

    public Human(int a , String n) // parameterised constructor .
    {
        age = a;
        name = n;
    }
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age; // this keyword refers to the current object which is calling the method .
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
       this.name = name;
    }


}

public class Constructor {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human(18,"Amitaa");

        System.out.println(obj.getAge() + " " + obj.getName());
        System.out.println(obj1.getAge() + " " + obj1.getName());


    }
}

/*
=======================================================================
🔥 CORE JAVA CHEAT SHEET: CONSTRUCTORS
=======================================================================

1. THE "WHAT" & "WHY" (Core Concept)
   - What: Constructor ek special block of code hai jo Object banne ke 
     turant baad call hota hai.
   - Why: Object ko initialize karne ke liye (memory milne ke baad usme 
     default/initial values daalne ke liye).
   - Real-world: Naya phone kharidne par jo factory settings aur default 
     apps aati hain, wo constructor set karta hai.

2. THE GOLDEN RULES OF CONSTRUCTORS
   - Rule 1: Constructor ka naam exactly Class ke naam jaisa hona chahiye.
   - Rule 2: Constructor ka KOI RETURN TYPE NAHI hota (not even 'void').
   - Rule 3: Isko explicitly call nahi karte, 'new' keyword lagate hi 
     ye automatically trigger ho jata hai.

3. TYPES OF CONSTRUCTORS
   A) Default Constructor (No-Args): 
      - Jisme koi parameter nahi hota. 
      - Agar class mein coder ne ek bhi constructor NAHI likha hai, 
        toh Java Compiler chupchaap ek khali default constructor daal 
        deta hai.
   
   B) Parameterized Constructor:
      - Jisme parameters pass hote hain (e.g., Human(int a, String n)).
      - Use: Har naye object ko alag-alag values se initialize karne ke liye.

=======================================================================
🚨 GENC NEXT KBA & INTERVIEW TRAPS (MOST IMPORTANT)
=======================================================================

TRAP 1: The "Return Type" Illusion
Question: Kya hoga agar maine constructor ke aage 'void' ya 'int' laga diya?
Ans: Compile-time error NAHI aayega. Par Java usko constructor nahi, 
     balki class ka ek normal method maan lega. Object creation pe wo 
     call nahi hoga.

TRAP 2: The "Hidden Constructor" Betrayal
Question: Maine 'Human(int age)' banaya hai. Ab main 'new Human()' call kar raha hu.
Ans: COMPILE TIME ERROR aayega. 
     Rule: Agar tune class mein ek bhi custom constructor (parameterized) 
     likh diya, toh Java apna free wala Default Constructor dena band kar 
     deta hai. Tujhe manually no-arg constructor likhna padega.

TRAP 3: Constructor Overloading
Question: Kya ek class mein ek se zyada constructors ho sakte hain?
Ans: YES. Isko Constructor Overloading kehte hain. Dono ka naam same hoga 
     par parameters (number of parameters ya data type) alag hone chahiye.

TRAP 4: Constructor Chaining ('this()' & 'super()')
- this() : Ek constructor se usi class ke doosre constructor ko call karne ke liye.
- super(): Child class ke constructor se Parent class ke constructor ko call karne ke liye.
- Rule: this() ya super() hamesha constructor ki PEHLI line honi chahiye.
=======================================================================
*/