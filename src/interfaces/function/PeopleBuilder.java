package interfaces.function;

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

    public People creationPeople () {
        return new People(name, age);
    }


}
