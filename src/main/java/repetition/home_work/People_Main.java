package repetition.home_work;

public class People_Main {
    public static void main(String[] args) {
        People people = new People();
        people.setName("Vach");
        people.setFamile("Qocharyan");
        people.setGender("Edvardovich");
        people.setYear(2004);

        System.out.println(people.getName());
        System.out.println(people.getFamile());
        System.out.println(people.getGender());
        System.out.println(people.getYear());


    }


}
