package Abstraction;
// Hiding all the Unnecessary details and show only the Important part of the data to the user
// we can achive Abstraction by using the -->  Abstract classes and By  ->>  Interface

public class Abstraction {
    public static void main(String[] args) {
        Mustang obj = new Mustang();
        // after creating the object of the child class 
        // Animal --> Horse --> Mustang  --? this hirarchy of sequence follows 

        obj.walk();  // here we calling the abstract  method of parent Animal class
    }
}



abstract class Animal {

    // constructor
    Animal() {
        System.out.println("Animal class Constructor called");
    }

    void eat(){                                 // Normal function
        System.out.println("Animal eat");
    }

    abstract void walk();                       // abstract function  
}

class Horse extends Animal{
    // constructror of horse class
    Horse(){
        System.out.println("Horse Contructor is called");
    };

    void walk(){
        System.out.println("Horse walk in 4 legs ");
    };
}

class Mustang extends Horse{
    // constructor
    Mustang(){
        System.out.println("Mustang constructor called");
    }

    void walk(){
        System.out.println("mustang race walking here ");
    }
}

