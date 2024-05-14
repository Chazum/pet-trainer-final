
/**
 * Cat has data of Pet class along with color. Adds color to the Pet to.String
 *
 * @author Chaz Harrison
 * @version Sept 17, 2021
 */
public class Cat extends Pet
{
    public String color;

    //constructor; adds color onto Pet data
    Cat(String color, String name, int health, int energy, int happiness){
        super(name, health, energy, happiness);
        this.color = color;
    }

    //adds color to superclass to.String in Pet
    public String toString() {
        return (color + super.toString()); 
    }

}

