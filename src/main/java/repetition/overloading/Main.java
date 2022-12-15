package repetition.overloading;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Vach");
        teacher.setYear(2004);
        teacher.setSalary(1000);
        teacher.setPhone("Iphone");

        Administeter administeter = new Administeter();
        administeter.setName("Anna");
        administeter.setDepartment("Music");
        administeter.setYear(2002);
        administeter.setPhone("Samsung");

        System.out.println("---------------");

        administeter.printInfo();
        System.out.println("------------------");
        teacher.printInfo();
    }
}
