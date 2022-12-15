package overloading_test2;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setSalary(55000);
        teacher.setSurname("Vardanyan");
        teacher.setName("Artak");
        teacher.setYear(36);
        teacher.setGender("xuy yevo");

        Student student = new Student();
        student.setName("Vach");
        student.setSurname("Qocharyan");
        student.setYear(2004);
        student.setRating(10);

        teacher.printInfo();
        System.out.println("----------------");
        student.printInfo();
    }
}
