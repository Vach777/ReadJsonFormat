package overloading_test2;

public class Teacher_2 extends Human_2 {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary" + " " + salary);
    }
}

