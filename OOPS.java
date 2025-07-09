public class OOPS {
    public static void main (String args[]){
        Pen p1 = new Pen(); //object p1 of class Pen 
        // Class name + object name = "new" keyword + constructor;
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    } 
}

// Agar "private" kar denge properties ko to usko simple (.)Dot operator se access nhi kar payenge
// esliye "get" aur "set" function ka use karenge 

class Pen{
    private String color;
    private int tip;
    
    void setColor(String newColor){
        color = newColor;
    }
    String getColor(){
        return this.color;
    } 

    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int phy,chem,maths;
    float percent;

    void percentage(float percentage){
        this.percent = percentage;
    }
}