
/**
 * Pet has fields name, health, energy, happiness and method toString
 *
 * @author Chaz Harrison
 * @version 9/17/2021
 */
 
// Create Pet class 
public class Pet {

  // define data
  int health = 0;
  int energy = 0 ;
  int happiness = 0;
  String name; 
  
  // behavior
  
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

}

