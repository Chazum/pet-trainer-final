
/**
 * Cat has data of Pet class along with color. Adds color to the Pet to.String
 *
 * @author Chaz Harrison
 * @version 10/1/2021
 */
public class Cat extends Pet
{
    public String color;

    //constructor; adds color onto Pet data
    Cat(String color, String name, int health, int energy, int happiness){
        super(name, health, energy, happiness);
        this.color = color;
    }
    
    //creates stats to update but does not assign them a value
    int healthUpdater;
    int happinessUpdater;
    int energyUpdater;
    
    //adds color to superclass to.String in Pet
    public String toString() {
        return (color + super.toString()); 
    }

    public String feed(){
        String petStatus = "";
        //prob is random value between 0 and 1
        double prob = Math.random();
        //status updaters are updates with the value health needs to be changed by
        if (prob > 0.5){
            happinessUpdater = -2;
            petStatus = (name + " is displeased by your offer of food and refuses to eat it --> +0 health, +0 energy, -2 happiness\n");
        }
        else { 
            energyUpdater = 2;
            happinessUpdater = 2;
            petStatus = (name + " eats the food and purrs as it licks its chops  --> +0 health, +2 energy, +2 happiness\n");
        }
        
        //cat class calls StatUpdater from pet class using stat values from cat class
        this.StatUpdater(healthUpdater, energyUpdater, happinessUpdater); 
        return petStatus;
    }

    public String walk() {
        String petStatus = "";
        double prob = Math.random();
        if (prob > 0.5){
            happinessUpdater = 2;
            energyUpdater = 3;
            healthUpdater = -2;
            petStatus = (name + " is not in the mood for a walk and eats a snack instead --> -2 health, +2 energy, +2 happiness\n");
        }
        else if (prob < 0.5 && energy < 5){
            happinessUpdater = -2;
            healthUpdater = 1;
            petStatus = (name + " drags its feet as you walk, tripping in the process --> +1 health, +0 energy, -2 happiness\n");
        }
        else{
            healthUpdater = 3;
            energyUpdater = -1;
            petStatus = (name + " seems to enjoy smelling the grass on your walk --> +3 health, -1 energy, +0 happiness\n");
        }
        //cat class calls StatUpdater from pet class using stat values from cat class
        this.StatUpdater(healthUpdater, energyUpdater, happinessUpdater); 
        return petStatus;
    }
}

