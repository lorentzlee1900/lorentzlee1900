/** 
 * Quote.java
 * @author: Zhan Li
 * @verison 4.3.7
 * @date 10/13/2021
 * CS 501
 * CCI
 * Drexel University
 * */
import java.util.Scanner;
import java.util.ArrayList;


public class Quote {
   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    ArrayList<Car> carList = new ArrayList<Car>();

    /**************************************************************************************************/
    int carId = 1;
    double originalValue = 1;
    double listedValue;
    double expectedValue;
    int years;

    int count = 0;
    String tally = ""; 

    System.out.println("Welcom to the second-hand cars value comparison system !!!");
    System.out.println("You can enter the used car information in the following sections and create a wish list for youself");
    System.out.println("You can add as many as cars you like in this list!");
    System.out.println("When you done, please enter 0 for all sections");
    System.out.println("For the ID of each car, please enter number follow the sequence as: 1, 2, 3, 4...");

    while (carId != 0){

      Car myCar = new Car();


      System.out.println("Enter the unique integer ID number of the car: ");
      carId = keyboard.nextInt();
      System.out.println("Enter the original value of the car: ");
      originalValue = keyboard.nextDouble();
      System.out.println("Enter the used years number (integer): ");
      years = keyboard.nextInt();
      System.out.println("Enter the listed value provided by dealers: ");
      listedValue = keyboard.nextDouble();

      keyboard.nextLine();

        myCar.setOriginalValue(originalValue);
        myCar.setYears(years);
        myCar.setListedValue(listedValue);
        expectedValue = myCar.getExpectedValue();
      
      if (carId != 0) {
        carList.add(new Car(carId, originalValue, years, listedValue, expectedValue));

        Car amount = carList.get(count);
          
        tally += "["+amount.toString() +"] \n\n";
      }
      count = count + 1;
      System.out.printf("Now you have %d cars in the list\n\n", count);
	 }

   System.out.println("Now you have following cars in your wish list");
   System.out.println(tally);

   /*****************************************************************************/
   
   int favorite = 1; 
   while (favorite !=0){
   System.out.println("Which car you have interests with? Please enter the ID of that car(please enter 0 when you want to stop): ");
   favorite = keyboard.nextInt();

  
        if (favorite != 0){
        Car favCar = carList.get(favorite - 1);
        expectedValue = favCar.getExpectedValue();
        
          System.out.println(favCar.getNotification());
        }
   }
   /**************************************************************************************************/

    Scanner keyboard1 = new Scanner(System.in);

    String dealerName = "null";
    String managerName;
    String phone;
    int time = 0;
    double discount = 0.0;
    boolean appointment;

    DealerCollection dealers = new DealerCollection();

    System.out.println("Welcome to the dealers management system !");
    System.out.println("In this section, you can manage dealers you visited before and store their information");
    System.out.println("Please enter 'done' for dealer's name when you want to stop");

    
    while (!dealerName.equalsIgnoreCase("DONE")){

        System.out.println("Enter the dealer's name: ");
        dealerName = keyboard1.nextLine();
        System.out.println("Enter the manager's name: ");
        managerName = keyboard1.nextLine();
        System.out.println("Enter the phone number of the dealer: ");
        phone = keyboard1.nextLine();
        System.out.println("Enter the number you spent for visiting this dealer: ");
        time = keyboard1.nextInt();
        System.out.println("Enter the discount rate the dealer offered: ");
        discount = keyboard1.nextDouble();
        System.out.println("Do you have a new appointment with this dealer? Enter true or false: ");
        appointment = keyboard1.nextBoolean();
  
        keyboard.nextLine();
  
        dealers.addDealer(dealerName, managerName, phone, time, discount, appointment);
        
        
        }
        System.out.println(dealers);





   System.out.println("See you next time!");

   }
}