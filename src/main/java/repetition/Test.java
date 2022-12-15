package repetition;

public class Test {
    String firstName;
    String lastName;
    int year;
    boolean isArmenian;
    char gender;

    public void sayHello() {
        System.out.println("hello");
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public String FullName() {
        return firstName + " " + lastName;
    }

    public void sum(int x, int y) {
        System.out.println(x + y);

    }

    public void print1toN(int n){
        for (int i =1; i<=n; i++){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}
