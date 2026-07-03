class Human
{
    private int age;
    private String name;

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


public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setName("Amitanshu");
        obj.setAge(11);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}



/*
=======================================================================
🔥 CORE JAVA NOTES: 'this' Keyword & Memory Allocation
=======================================================================

1. WHAT IT IS: 
   'this' is a reference variable that points to the CURRENT OBJECT 
   (jis object ne us method ko call kiya hai).

2. WHY WE NEED IT (Variable Shadowing):
   Jab class ke Instance Variable aur method ke Local Variable ka naam 
   same ho jata hai, tab Java confuse hota hai. 'this' keyword se hum 
   Java ko clear karte hain:
   this.age = age;  // (Current Object's age) = (Local method's age)

3. MEMORY ALLOCATION (The Hidden Truth):
   - Objects hamesha HEAP memory mein bante hain.
   - Methods aur unke local variables STACK memory mein chalte hain.
   - Jab hum obj.method() call karte hain, Java secretly us object ka 
     Heap memory address method ko pass karta hai.
   - Method us address ko 'this' naam ke hidden variable mein rakh leta hai.
=======================================================================
*/