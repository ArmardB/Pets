package io.zipcoder.pets;

/**
 * Created by armardbellamy on 9/26/16.
 */
public class Dog extends Pet {

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}
