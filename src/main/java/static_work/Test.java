package static_work;

public class Test {
    public static void main(String[] args) {
        Human h = new Human();
        h.year = 1999;

        Human h2 = new Human();
        h2.year = 2020;

        System.out.println(h.year);
    }
}
