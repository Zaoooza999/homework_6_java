package guru.qa;

import java.util.List;
import java.util.Objects;

public class Human {
    private final String name;
    private static final String name2 = "dima";
    private int age;
    private boolean isCute;

    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }
public Human incrementAge() {
        return new Human(
                this.name,
                (this.age + 1),
                this.isCute
        );
}

    @Override
    public boolean equals(Object o) {
        Human human = (Human) o;
        return name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isCute);
    }

    static void printSomeValues (int i, String str, List<String> list){
    System.out.println("int: " + i + ", string: " + str + ", list: " + list);
}

static void sayHello(){
    System.out.println("Hello " + name2 + " !!!!!!");
}

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }
}
