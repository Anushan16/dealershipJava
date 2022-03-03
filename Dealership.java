import java.util.Scanner;

public class Dealership{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println("- Select option 'a' to buy a car");
        System.out.println("- Select option 'b' to sell a car");

        String option = scan.next();
        // scan.nextline produces a String, unable to set this value to char 
        
        switch(option) {
            case "a":
                System.out.println("\nYou chose 'a' ");
                System. out.println("\nDo you have insurance? Type 'yes' or 'no'");

                String insurance  = scan.next();
                    switch(insurance){
                    case "yes":
                        // continue code
                        System. out.println("\nDo you have a license? Type 'yes' or 'no'");

                        String license  = scan.next();
                        switch(license){
                        case "yes":
                        // continue code
                            System. out.println("\nWhat is your credit score? ");

                            int creditScore  = scan.nextInt();
                            if (creditScore >= 600){
                                System.out.println("Sold! Pleasure doing business with you.");
                            } else {
                                System.out.println("Sorry, You have not been approved.. ");
                            }
                        break;    
                        case "no":
                            System.out.println("Sorry, a license is required to purchase a vehicle");
                        break;
                        default:
                            System.out.println("Sorry, that was a invalid choice");
                        }
                    break;
                    case "no":
                        System.out.println("Sorry, insurance is required to purchase a vehicle");
                    break;
                    default:
                        System.out.println("Sorry, that was a invalid choice");
                }
            break;
            case "b":
                System.out.println("\nWhat is your car valued at?");
                int carValue  = scan.nextInt(); 
            
                System.out.println("\nHow much do you want for a car?");
                int sellValue  = scan.nextInt(); 

                if (sellValue < carValue && sellValue < 30000){
                    System.out.println("Sure, we'll buy your vehicle...");
                } else {
                    System.out.println("Sorry, we won't be able to by your vehicle..");
                }
            break;
            default:
            System.out.println("Sorry, that was a invalid choice");

        }
    }
}