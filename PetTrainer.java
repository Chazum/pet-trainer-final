
/**
 * Pet Trainer
 * Allows user to scan in two pets that have three stats. Five rounds 
 * are played where the user can choose action feed or walk each round 
 * for each plant. Pet stats increase depending upon the outcome of 
 * each action. Stats are added up and the pet with the highest stat 
 * total wins!
 * 
 * @author Chaz Harrison
 * @version 10/1/2021
 */
import java.util.Scanner;
public class PetTrainer
{
    //main

    public static void main(String[] args) {
        Scanner Names = new Scanner(System.in);

        System.out.println("Welcome to the pet trainer!");
        System.out.println("Enter the name of a dog");

        String doggy = Names.next();

        System.out.println("Enter the breed of "+ doggy);

        String breed = Names.next();

        System.out.println("Enter the name of a cat");

        String kitty = Names.next();

        System.out.println("Enter the color of "+ kitty);

        String color = Names.next();

        //Creates a Dog and a Cat based on inputs from user
        Pet dog = new Dog(breed, doggy, 5, 5, 5);

        Pet cat = new Cat(color, kitty, 5, 5, 5);

        // create round counter
        int round=1;    
        //loop that prompts user to choose an action and then calls pickAndRunAction
        //loop adds one to counter and then contiues until round five rounds are over
        do{
            System.out.println("What would you like to do with " + dog.name + "?");
            pickAndRunAction(dog);
            System.out.println("What would you like to do with " + cat.name + "?");
            pickAndRunAction(cat);

            round++;
        }while(round<=5); 

        //The created dog calls compareScore on the cat and the difference is saved 
        int finalScoreWin = dog.compareScore(cat);
        //Calculates final scores of both pets
        int finalDogScore = dog.petScore();
        int finalCatScore = cat.petScore();

        //Conditions for winning
        //Prints out the winner and final score
        //dog score - cat score > 0 means dog wins by having higher score
        if (finalScoreWin > 0){
            System.out.println("At the end of the week, " + dog.name + " has the highest stats and therefore wins! You may be a dog person.\n");
            System.out.println(dog.name + "Total Score: "+ finalDogScore);
            System.out.println(cat.name + "Total Score: "+ finalCatScore);

        }
        //dog score - cat score < 0 means cat wins
        else if (finalScoreWin < 0){
            System.out.println("At the end of the week, " + cat.name +" has the highest stats and therefore wins! You may be a cat person.\n");
            System.out.println(dog.name + "Total Score: "+ finalDogScore);
            System.out.println(cat.name + "Total Score: "+ finalCatScore);
        }
        else {
            System.out.println("At the end of the week, " + dog.name +" and " + cat.name + "have equal stats! What an equal-oppurtunity pet owner you are!\n"); 
            System.out.println(dog.name + " Total Score: "+ finalDogScore);
            System.out.println(cat.name + " Total Score: "+ finalCatScore);
        }

        System.out.println("Thanks for playing the Pet Trainer!\n\n");

    }    

    public static void pickAndRunAction(Pet pet){

        //loop looking for valid action
        while(true){

            Scanner Action = new Scanner(System.in);

            System.out.println("Choose an action by typing 'feed' or 'walk'");

            String choice = Action.next();
            if (choice.equals("feed")){
                System.out.println(pet.feed());
                //breaks after a valid action is entered and pet calls feed method
                break;
            }
            else if (choice.equals("walk")){ 
                System.out.println(pet.walk());
                break;
            }
            else {
                //if walk or feed are not entered the loop continues
                System.out.println("Invalid action, please try again");
            }
        }    
    }
}

