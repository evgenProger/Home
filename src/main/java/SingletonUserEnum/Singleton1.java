package SingletonUserEnum;

public class Singleton1 {

    // Declare a date to test Singleton function

    int date;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }




    private static Singleton1 instance = null;

    // Disable new operator by declaring its constructor as private

    private Singleton1() {

    }

    // Create a factory method. Using static method so we can call this method via class

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }


}
