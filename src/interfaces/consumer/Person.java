package interfaces.consumer;

import java.util.Objects;

public class People {
    private String name;
    private int age;

    public People (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public String getName () {
        return name;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name);
    }

    @Override
    public int hashCode () {
        return Objects.hashCode(name);
    }

    @Override
    public String toString () {
        return "People " + "age=" + age + ", name='" + name + '\'';
    }
}
