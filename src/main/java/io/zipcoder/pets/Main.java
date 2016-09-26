package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by armardbellamy on 9/26/16.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pet> petList = new ArrayList<Pet>();
        int numberOfPets;
        String petName;
        String typeOfPet;

        System.out.print("How many pets do you have? ");
        numberOfPets = scanner.nextInt();
        scanner.nextLine();

        while(numberOfPets > 0) {
            System.out.print("What kind of pet do you have? ");
            typeOfPet = scanner.nextLine();
            typeOfPet = typeOfPet.toLowerCase();
            System.out.print("What is your pet's name? ");
            petName = scanner.nextLine();

            switch (typeOfPet) {
                case "dog":
                    petList.add(new Dog(petName));
                    numberOfPets--;
                    break;
                case "cat":
                    petList.add(new Cat(petName));
                    numberOfPets--;
                    break;
                case "sugarglider":
                    petList.add(new SugarGlider(petName));
                    numberOfPets--;
                    break;
                default:
                    System.out.println("This pet is not an option.");
            }
        }

        for(Pet pet : petList) {
            System.out.println(pet.getName() + " (" + pet.getClass().getSimpleName() + ")");
        }
    }
}
