/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a> 
@version    1.4
@since      1.0
*/

/* 
Creature defines the structure of an animal.
*/

public class Creature {
    /**
    @param args Ignored command-line argument
    */
    public static void main(String[] args) {
        String myAnimalType = animal();
        System.out.println("This is a placeholder for Creature " + myAnimalType);
    }

    static String animal() {
        String animalType = "dog";
        return animalType;
    }
}

