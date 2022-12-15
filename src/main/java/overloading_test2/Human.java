package overloading_test2;

public class Human {
    private String name;
    private String surname;
    private String gender;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Name" + name);
        System.out.println("Surname"+surname);
        System.out.println("Gender"+gender);
        System.out.println("Year"+year);
    }
}
