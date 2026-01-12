public class OOPS {
 
   // in java class name should start with capital letter and 
    // Function/Method name starts with the small leters

    public static void main(String args[]){
        Pen obj = new Pen();
        obj.setColor("red");
        System.out.println(obj.color);

        obj.setTip(5);
        System.out.println(obj.tip);

    }
}

// define class 
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

class Animal{

}

