package SingletonUserEnum;

public class Prpgramm {

    public static void main(String[] args) {
        Singleton1 x = Singleton1.getInstance();
        x.setDate(4);

        // try to create another instance
        Singleton1 y = Singleton1.getInstance();
        y.setDate(465);

        if (x.getDate() == 465) {
            System.out.println("We have only one instance because code at line 10 does not create another object. It use the same memory with x instance");
        }



    }
}
