package repetition.overloading;

public class Administeter extends Human {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Department"+ department);


    }
}
