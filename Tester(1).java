
/**
 * Create dogs, cats, and pets and print out their stats. 
 *
 * @author Chaz Harrison
 * @version 9/17/2021
 */
public class Tester
{
    //main

    public static void main(String[] args) {

        //create new dog with values breed, name, energy, health, and happiness
        //prints out toString() with values of doggy
        Dog doggy = new Dog("German Shepherd ", "Maddie",7,9,8);
        System.out.println(doggy.toString());

        //create new cat with values color, name, energy, health, and happiness
        //prints out from toString() with values of kitty
        Cat kitty = new Cat("Gray cat ", "Penelope",5,5,5);
        System.out.println(kitty.toString());

        //creates new pet with values of Pet 
        //Not dog or cat, so toString() with petty values is added to Pet and printed
        Pet petty = new Pet("Alex",3,4,6);
        System.out.println("Pet " + petty.toString());
    }

}

