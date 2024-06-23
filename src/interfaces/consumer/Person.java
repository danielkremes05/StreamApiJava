package interfaces.consumer;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person (String name, int age) {
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
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode () {
        return Objects.hashCode(name);
    }

    @Override
    public String toString () {
        return "People " + "age=" + age + ", name='" + name + '\'';
    }

    @Override
    public int compareTo (Person other) {
        return this.name.compareTo(other.name);
    }

    public int compareToAge (Person other) {
        return Integer.compare(this.age, other.age);
    }
}
