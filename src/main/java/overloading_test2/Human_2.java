package overloading_test2;

public class Human_2 {
    String name;
    String fimale;
    int year;
    String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFimale() {
        return fimale;
    }

    public void setFimale(String fimale) {
        this.fimale = fimale;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printInfo() {
        System.out.println("Name" + " " + name);
        System.out.println("Fimale" + " " + fimale);
        System.out.println("Year" + " " + year);
        System.out.println("Phone" + " " + phone);
    }
}
