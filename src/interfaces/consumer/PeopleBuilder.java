package interfaces.consumer;

public class PeopleBuilder {
    private String name;
    private int age;

    public PeopleBuilder setAge (int age) {
        this.age = age;
        return this;
    }

    public PeopleBuilder setName (String name) {
        this.name = name;
        return this;
    }

    public Person creationPerson () {
        return new Person(name, age);
    }

}
