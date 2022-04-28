import java.util.Scanner;
import java.lang.*;

public class MarsAdventurePlus {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The game is about to start...");
        System.out.println("Hi there what's your name?");
        String spacemanName = input.nextLine();
        System.out.println("Hi, " + spacemanName + " --- Welcome to The Mars Adventure Game. Yesterday,\n" +
        "you received a call from your good friend at NASA. They need someone to go to Mars\nthis weekend," +
        "and you've been chosen to be our next brave explorer into the stars");
        System.out.println("Are you excited? Type Y or N");
        char choice = input.next().charAt(0);
        if(choice == 'Y') {
            System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
        } else if(choice == 'N') {
            System.out.println("Sorry to hear that, I'll pass on this information to my supervisors");
        } else {
            System.out.println("Couldn't parse. Please continue");
         }
        System.out.println("It's time to pack for your trip to Mars.\n"+
            "How many suitcases do you plan to bring?");
        input.nextLine();
        int bagCount = input.nextInt();
        if(bagCount == 2) {
            System.out.println("I knew you'd say that. TWO bags is the perfect amount for this trip!!");
        } else if(bagCount >= 2) {
            System.out.println("That's way too many. You'll have to pack more\nlightly." +
                    " Please try to fit your stuff into 2 suitcases.");
        } else if(bagCount < 2) {
            System.out.println("Light traveler, I see. Your trip should be a cinch!");
         }
         input.nextLine();
         System.out.println("You're allowed to bring one companion animal\nwith you."+
         " What kind of companion animal would you like to bring?");
         String petType = input.nextLine();
         System.out.println("Great Choice");
         System.out.println("What is your " + petType + "'s name?");
         String petName = input.nextLine();
         System.out.println("Excellent, so we have " + petName + " the " + petType + ". Great choice!");
         System.out.println("NASA has an interior design team offering to outfit\nyour space ship." +
         " You have a couple of options for the interior decor of your ship.");
         System.out.println("Your options are:\n" +
         "A Sleek, modern minimalism - 2001 Space Odyssey Style\n" +
         "B Retro/vintage space age - Think Guardians of the Galaxy Vol. 2\n" +
         "C SF Hippie Chic - ???\n" +
         "Which decor would you like? Choose A, B, C.");
         char interior = input.next().charAt(0);
         input.nextLine();
         switch(interior) {
            case 'A':
            System.out.println("Excellent choice! You'll have no issues navigating around your spaceship!");
            break;
            case 'B':
            System.out.println("So you're the rogue type I presume? We'll make sure your spaceship\n"+
            "is fitted with the nitty-gritty specifications that you desire");
            break;
            case 'C':
            System.out.println("Don't know what this loadout means but my interior department tells me\n" +
            "that they have this in stock. Yes I checked in the back and we have it. So, have fun!");
            break;
            default:
            System.out.println("Bad Input!\nYou will be getting an interior to whatever it looks like\ninside an" +
            " F-35, not fancy, but it should get the job done.");
            break;
            }
            System.out.println("I can see it now:\n" +
            spacemanName + " and " + petName + " surfing the celestial abyss ...\n" +
            "in a retro spaceship.\n"
            + spacemanName + " -- the day is here!\n" +
            "You crawl into the spaceship with " + petName + "!!\n" +
            "Brace for take off!\n" +
            "5 ...\n" +
            "4 ...\n" +
            "3 ...\n" +
            "2 ...\n" +
            "1 ...\n" +
            "* LIFTOFF *");
    }
}
