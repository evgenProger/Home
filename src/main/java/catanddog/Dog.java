package catanddog;

public class Dog {
    public void sayHello() {
        System.out.println("Гав");
    }

    public void catchCat(Cat cat) {
        System.out.println("Кошка поймана");
        new Dog().sayHello();
        cat.sayHello();


    }
}
