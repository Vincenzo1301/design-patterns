package hm.edu.software.architecture.design.patterns.expressionbuilder;

public class Bird {

    private String name;
    private int age;
    private String color;

    public Bird name(String name) {
        this.name = name;
        return this;
    }

    public Bird age(int age) {
        this.age = age;
        return this;
    }

    public Bird color(String color) {
        this.color = color;
        return this;
    }
}
