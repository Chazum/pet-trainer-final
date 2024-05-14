
/**
 * Dog has data of Pet class along with breed. Adds breed to the Pet to.String
 *
 * @author Chaz Harrison
 * @version 10/1/2021
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
    
    //creates stats to update but does not assign them a value
    int healthUpdater;
    int happinessUpdater;
    int energyUpdater;
        
    //method
    public String feed() {
        String petStatus = "";
        if (energy >= 7 && health < 6) {
            //status updaters are updates with the value health needs to be changed by
            healthUpdater = -2;
            happinessUpdater = -2;
            petStatus = (name + " ate a chocolate cookie and got sick :( --> -2 health, +0 energy, -2 happiness\n");
        }
        else {
            happinessUpdater = 2;
            energyUpdater = 2;
            petStatus = (name + " ate all of your cookies and is loving life --> +0 health, +2 energy, +2 happiness\n");
        }
        //dog class calls StatUpdater from pet class using stat values from dog class
        this.StatUpdater(healthUpdater, energyUpdater, happinessUpdater);
        return petStatus;
    }

    public String walk() {
        String petStatus = "";
        if (energy < 5) {
            healthUpdater = -1;
            happinessUpdater = -3;
            petStatus = (name + " reluctantly goes on a walk with you and becomes exhausted. -1 health, +0 energy, -3 happiness\n");
        }
        else {
            healthUpdater = 2;
            happinessUpdater = 2;
            energyUpdater = -1;
            petStatus = (name + " goes on a walk with you and has a great time! +2 health, -1 energy, +2 happiness\n");
        }
        //dog class calls StatUpdater from pet class using stat values from dog class
        this.StatUpdater(healthUpdater, energyUpdater, happinessUpdater); 
        return petStatus;
    }

    //adds breed onto previous to.String in superclass Pet
    public String toString() {
        return (breed + super.toString()); 
    }

}

