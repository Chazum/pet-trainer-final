
/**
 * Pet has fields name, health, energy, happiness and method toString
 *
 * @author Chaz Harrison
 * @version 10/1/2021
 */

// Create Pet class 
public class Pet {

    // define data
    int health = 5;
    int energy = 5;
    int happiness = 5;
    String name; 

    //updates stats from both dog and cat class depending upon values retrieved from each action case 
    public void StatUpdater(int healthUpdater, int energyUpdater, int happinessUpdater){
        this.happiness += happinessUpdater; 
        this.health += healthUpdater;
        this.energy += energyUpdater;
    }

    // constructor that creates a pet with a name, health, energy, and happiness levels
    public Pet(String name, int health, int energy, int happiness) {
        this.health = health; 
        this.energy = energy;
        this.happiness = happiness; 
        this.name = name;
    }

    //creates String using values from Pet
    public String toString()
    {
        return (name + " (health = " + health 
            + ", energy = " + energy + ", happiness = " + happiness + ")");
    }

    public String feed() {
        return "";
    }

    public String walk() {
        return ""; 
    }

    public int compareScore(Pet pet){
        int petTotal = pet.health + pet.happiness + pet.energy;
        int currentPetTotal = this.health + this.happiness + this.energy;
        return currentPetTotal - petTotal;
    }

    public int petScore(){
        int petTotal = this.health + this.happiness + this.energy;
        return petTotal;
    }
}

