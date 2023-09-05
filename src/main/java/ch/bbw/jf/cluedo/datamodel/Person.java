package ch.bbw.jf.cluedo.datamodel;

/**
 * Class: Person
 *
 * @author: Schules
 * @date: 29.08.2023
 */

//
public class Person {
    private String salutation; //Attribut ist ein Wert, der einem objekt zugewiesen werden kann (Eigenschaft)
    private String name;
    private int age;
    private String feature;
    private double height;
    private String clothes;
    private String haircolor;
    private String color;
    private String imgPath;

    //Objekt ist eine Instanz einer Klasse

    //Konstruktor wird verwendet, um ein neues Objekt zu instanziieren und direkt Werte mitzugeben
    public Person(String salutation, String name, int age, String feature, double height, String clothes, String haircolor, String color, String imgPath) {
        this.salutation = salutation;
        this.name = name;
        this.age = age;
        this.feature = feature;
        this.height = height;
        this.clothes = clothes;
        this.haircolor = haircolor;
        this.color = color;
        this.imgPath = imgPath;
    }

    //Eine Methode ist etwas, was ein Objekt kann
    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
