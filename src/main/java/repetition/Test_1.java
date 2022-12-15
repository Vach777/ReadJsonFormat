package repetition;

public class Test_1 {
    public static void main(String[] args) {
        Test test = new Test();
        test.firstName = "Vach";
        test.lastName = "Qocharyan";
        test.gender = 'm';
        test.isArmenian = true;
        test.year = 2004;

        Test test2 = new Test();
        test2.firstName = "Aram";
        test2.lastName = "Vardanyan";
        test2.gender = 'm';
        test2.isArmenian = true;
        test2.year = 2001;

        System.out.println(test.firstName + " " + test2.lastName);

        if (test.year > test2.year)
            System.out.println(test.firstName);
        else System.out.println(test2.firstName);

        System.out.println(test.year < test2.year ? test.firstName : test2.firstName);

//        Car car = new Car();
//        car.model = "BMW";
//        car.year = 2006;
//        car.engine = 3.6;

        test2.sayHello();
        test.sayHello();

//        System.out.println(test2.firstName + " "+ test.lastName);
//        System.out.println(test.firstName + " " + test2.lastName);
        test.printFullName();
        test2.printFullName();

        String s = test2.FullName();
        System.out.println("Full name of test2" + s);

        test.sum(4, 6);
        test2.print1toN(5);

        Car car = new Car();
        car.setModel("Bmw");
        System.out.println(car.getModel());
        car.setEngine(8.8);
        System.out.println(car.getEngine());
        car.setYear(2008);
        System.out.println(car.getYear());

        String text = "Hello from OOP";
        System.out.println(text.length());
        System.out.println(text.charAt(0));

        for(int i=0; i<text.length(); i++){
            System.out.println(text.charAt(i));
        }

        System.out.println("-------------------");

        int countOFS = 0;
        for (int i = 0; i< text.length(); i++){
            if (text.charAt(i)=='s')
                countOFS++;
        }
        System.out.println(countOFS);

        System.out.println(text.toUpperCase());






    }
}
