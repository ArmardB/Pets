package io.zipcoder.pets;

/**
 * Created by armardbellamy on 9/26/16.
 */
public class SugarGlider extends Pet {

    public SugarGlider() {
        super();
    }

    public SugarGlider(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Squeak!";
    }
}
