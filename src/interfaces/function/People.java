package interfaces.function;

public class People {
    private String name;
    private int age;

    public People (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public String getName () {
        return name;
    }


}
