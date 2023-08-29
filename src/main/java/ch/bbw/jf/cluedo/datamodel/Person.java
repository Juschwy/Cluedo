package ch.bbw.jf.cluedo.datamodel;

/**
 * Class: Person
 *
 * @author: Schules
 * @date: 29.08.2023
 */
public class Person {
    private String salutation;
    private String name;
    private int age;
    private String feature;
    private double height;
    private String clothes;
    private String haircolor;
    private String color;

    public Person(String salutation, String name, int age, String feature, double height, String clothes, String haircolor, String color) {
        this.salutation = salutation;
        this.name = name;
        this.age = age;
        this.feature = feature;
        this.height = height;
        this.clothes = clothes;
        this.haircolor = haircolor;
        this.color = color;
    }
}
