package io.zipcoder.pets;

/**
 * Created by armardbellamy on 9/26/16.
 */
public class Pet {

    protected String name;

    public Pet() {
        this.name = "Sad, no-name pet.";
    }

    public Pet(String name) {
        this.name = name;
    }

    public String speak(){
        return "Hey, please take me home.";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
