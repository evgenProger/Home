public class Human {
    short age;
    String name;
    String secondName;
    String favoriteSport;

    Human() {}

    Human(short age, String name, String secondName, String favoriteSport) {
        this(age, name, secondName);
        this.favoriteSport = favoriteSport;
    }

    Human(short age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
    public static void main(String[] args) {
        Human human = new Human();
        Human human1 = new Human((short) 39, "Evgeny", "Ivanov", "Tennis");
        Human human2 = new Human((short) 39, "Evgeny", "Ivanov");
    }
}
