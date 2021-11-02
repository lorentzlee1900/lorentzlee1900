import java.util.Scanner;

public class DealerTester
{

public static void main(String[] args)
{
    Scanner keyboard = new Scanner(System.in);


    String dealerName = "";
    String managerName;
    String phone;
    int time = 0;
    double discount = 0.0;
    boolean appointment;

    DealerCollection dealers = new DealerCollection();

    System.out.println("Welcome to the dealers management system !");
    System.out.println("In this section, you can manage dealers you visited before and store their information");
    System.out.println("Please enter 'done' for dealer's name when you want to stop");

    
    while (!dealerName.equalsIgnoreCase("Done")){

        System.out.println("Enter the dealer's name: ");
        dealerName = keyboard.nextLine();
        System.out.println("Enter the manager's name: ");
        managerName = keyboard.nextLine();
        System.out.println("Enter the phone number of the dealer: ");
        phone = keyboard.nextLine();
        System.out.println("Enter the number you spent for visiting this dealer: ");
        time = keyboard.nextInt();
        System.out.println("Enter the discount rate the dealer offered: ");
        discount = keyboard.nextDouble();
        System.out.println("Do you have a new appointment with this dealer? Enter true or false: ");
        appointment = keyboard.nextBoolean();
  
        keyboard.nextLine();
  
        dealers.addDealer(dealerName, managerName, phone, time, discount, appointment);
        
        
        }
        System.out.println(dealers);
       }
    
    
    }
    