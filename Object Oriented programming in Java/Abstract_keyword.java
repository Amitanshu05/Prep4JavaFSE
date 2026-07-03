abstract class Car
{
    public void drive(){
        System.out.println("Drive");
    }

    public void music(){
        System.out.println("Music");
    }

    public abstract void mamla();
    public abstract void Mamla();
}

class GWagon extends Car // concrete class - jiska object ban ske 
{
    public void mamla(){

    }

    public void Mamla(){
        
    }
}


public class Abstract_keyword {
    public static void main(String[] args){

        Car c = new GWagon();
        c.drive();

    }
}

// abstract class ke saare abstract methods should be inherited in its child class .