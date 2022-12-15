package overloading_test2;

public class Student_2 extends Human_2 {
    int raiting;

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Raiting" + " " + raiting);
    }
}
