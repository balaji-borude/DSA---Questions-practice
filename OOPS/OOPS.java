public class OOPS {
    // in java class name should start with capital letter and
    // Function/Method name starts with the small leters

    public static void main(String args[]) {
        Pen obj = new Pen();
        // obj.setColor("red");
        // System.out.println(obj.color);

        // obj.setTip(5);
        // System.out.println(obj.tip);

        Student stdObj = new Student();

        stdObj.setName("Balaji");
        System.out.println(stdObj.name);
        stdObj.setPercentage(40.9f);
        System.out.println(stdObj.getPercentage());
    }
}

// define class
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class Student {

    int marks;
    String name;
    private float percentage;
    private int Uuid;

    // Geter --> is used to get the value of the --> though the variable/property is
    // a Private
    // setter is used to set the value

    // gettters
    int getMarks() {
        return marks;
    };

    float getPercentage() {
        return percentage;
    };

    // setters
    void setName(String name) {
        this.name = name;
    }

    void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    void setUuid(int uuid) {
        this.Uuid = uuid;

    }
}
