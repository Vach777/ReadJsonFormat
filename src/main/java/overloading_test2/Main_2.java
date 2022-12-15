package overloading_test2;

public class Main_2 {
    public static void main(String[] args) {
        Student_2 student_2 = new Student_2();
        student_2.setName("Vach");
        student_2.setYear(2004);
        student_2.setPhone("Iphone");
        student_2.setFimale("Qocharyan");
        student_2.setRaiting(10);

        Teacher_2 teacher_2 = new Teacher_2();
        teacher_2.setName("Armen");
        teacher_2.setFimale("Avetisyan");
        teacher_2.setYear(1995);
        teacher_2.setPhone("Samsung");
        teacher_2.setSalary(150000);

        student_2.printInfo();
        System.out.println("------------------");
        teacher_2.printInfo();
    }
}
