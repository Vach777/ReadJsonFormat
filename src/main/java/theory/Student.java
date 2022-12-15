package theory;

public class Student extends Human{
    private double mark;
    public Student(){
        super("Vach");
    }

    public double getMark(){
        return mark;
    }
    public void setMark(double mark){
        this.mark=mark;
    }

}
