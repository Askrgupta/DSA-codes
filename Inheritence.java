public class Inheritence {
    public static void main(String[]args){
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breath");
    }
}


// Derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim");
    }

    boolean walk(){
       return false;
    }
}