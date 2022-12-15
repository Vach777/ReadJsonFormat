package overloading_test2;

public class Student extends Human {
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Ratting" + rating);

    }
}
