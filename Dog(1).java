
/**
 * Dog has data of Pet class along with breed. Adds breed to the Pet to.String
 *
 * @author Chaz Harrison
 * @version 09/17/2021
 */
public class Dog extends Pet
{
    //add data to dog class
    public String breed;

    //constructor; takes from Pet class but adds "breed"
    public Dog(String breed, String name, int health, int energy, int happiness){
        super(name, health, energy, happiness); //super retrieves info from Pet class
        this.breed = breed;
    }

    //adds breed onto previous to.String in superclass Pet

    public String toString() {
        return (breed + super.toString()); 
    }

}


