package io.zipcoder.pets;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by armardbellamy on 9/26/16.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> pets = new HashMap<String, String>();
        int numberOfPets;
        String petName;
        String typeOfPet;

        System.out.print("How many pets do you have? ");
        numberOfPets = scanner.nextInt();

        while(numberOfPets > 0){
            System.out.print("What kind of pet do you have? ");
            typeOfPet = scanner.nextLine();
            System.out.print("What is your pet's name? ");
            petName = scanner.nextLine();
            pets.put(typeOfPet, petName);
            numberOfPets--;

        }

        for (String key: pets.keySet() ) {
            System.out.println("Type of Pet: " + key + "Name: " + pets.get(key));
        }


    }






}
