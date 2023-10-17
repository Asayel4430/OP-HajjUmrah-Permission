//asayel qaid
//443011953
//groub 8 - 16
package op.assignment;
import java.util.Random;
import java.util.Scanner;
public class OPAssignment {
   
   static Scanner s = new Scanner(System.in);
     static final String TEXT_GREEN = "\u001B[32m";//Green Color. font colors in Java console output
     static final String TEXT_BLACK = "\u001B[30m";//Black Color. font colors in Java console output
     static final String TEXT_RED = "\u001B[31m";//Red color
     static final String TEXT_BLUE = "\u001B[34m";//Blue color
    //static - to use variables anywhere in the code and modify their value
    
      static String Transportation = ""; //static - to use variables anywhere in the code and modify their value
      static double TransportationPrice = 0.0;
      static String ZamzamWater = "";
      static double ZamzamWaterPrice = 0.0;
      static String VisitMuseum = "";
      static double VisitMuseumPrice = 0.0;
      static int neadwheelchair = 0;
      static String Evulation = "";
    
    public static void main(String[] args) {
      //variable Defenations
   
        String Subscription = "";
        double SubscriptionPrice = 0.0;

        Random rand = new Random();//create random number for Permission Number
        String UserName = "";
        int UserNumber = 0;

        int[] arrayWheelChair = new int[4];

        int NationalNumber = 0;
        String UserNationality = "";
        int year_of_expiration = 0;

        int PermissionNumber = 0;
        String TypePermission = "";

        String weekday = "";
        String time_slot = null;

        System.out.println( "       ​​​​​🅆🄴🄻🄲🄾🄼🄴 🅃🄾 🄽🅄🅂🅄🄺\n");
        System.out.println("   Through the Nusuk you can issue the\nnecessary permits to perform Umrah or Hajj\n");
        System.out.println( ""
                +              "   ▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓ \n"
                + TEXT_GREEN + "   ▓╫─▄▀────────────▄▀───────────▄▀─╫▓ \n"
                + TEXT_GREEN + "   ▓╫─▀▄───────────▐█────────────▀▄─╫▓ \n"
                + TEXT_GREEN + "   ▓╫─▄▌▄───────────▀▄───────────▄▌▄╫▓ \n"
                + TEXT_GREEN + "   ▓▄▀░▓░▀▄──────────▌─────────▄▀░▓░▀▓ \n"
                + TEXT_GREEN + "   ▓░░░░░░░▌──────▄▄▀▀▄▄──────▐▓░░░░░▓ \n"
                + TEXT_GREEN + "   ▓▓░░░░░▓▀────" + TEXT_BLACK + "▄▀░░▓▓░░▀▄"
                         + "" + TEXT_GREEN + "────▀▄░░░░░▓ \n"
                + TEXT_GREEN + "   ▓╫▓█▓█▓─────▐▓░░░░░░░░▓▌─────▓█▓█▓▓ \n"
                + TEXT_GREEN + "   ▓╫▐░░░▌─────██▀▀▀▀▀▀▀▀██─────▐░░░╫▓ \n"
                + TEXT_GREEN + "   ▓╫▐░█░▌───▄▄████████████▄▄───▐░█░╫▓ \n"
                + TEXT_GREEN + "   ▓╫▐░░░▌───▐▓▓▓▌▐▒▓▓▒▌▐▓▓▓▌───▐░░░╫▓ \n"
                + TEXT_GREEN + "   ▓╫▐░█░▌───▐▓▓▓▌▐▓▒▒▓▌▐▓▓▓▌───▐░█░╫▓ \n"
                + TEXT_GREEN + "   ▓╫▐░░░▌▄▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▄▐░░░╫▓ \n"
                + TEXT_GREEN + "   ▓╫▐░█░███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███░█░╫▓ \n"
                + TEXT_GREEN + "   ▓╫▐░░░▌░█▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▓▒▒▐░█░╫▓ \n"
                + "   ◙═════════════════════════════════◙ \n"
                + "");

        //input Prameters
        System.out.println("Enter your Name:");//The user is asked to enter his name
        UserName = s.next();//Take the entered value
        System.out.println("welcome " + UserName);
        System.out.print("Enter your MobileNumber:\n");//Request to enter the number
        UserNumber = s.nextInt();//Take the entered value
        System.out.println("Enter the code you got by means of an SMS message:");
        s.next();

        int Choose;//Define a variable of type int  
        do {
            System.out.println("what you want to do:");//Request to choose one of the following options
            System.out.println("1-Hajj");
            System.out.println("2-Umrah");
            System.out.print(" > Enter your choice:  ");

            Choose = s.nextInt();//Take the selected values
            switch (Choose) {//Define the entered value
                case 1://if user choose 1 he want do Hajj
                    TypePermission = "Hajj";
                   int nationality; 
                    do { 
                        System.out.println("enter your nationality:"); 
                        System.out.println("1-Saudi"); 
                        System.out.println("2-not Saudi"); 
                        System.out.print(" > Enter your choice:  "); 
                        nationality = s.nextInt(); 
                        if (nationality == 1) { 
                            System.out.println("enter your national ID number please"); 
                            NationalNumber = s.nextInt(); 
                            UserNationality = "Saudi"; 
                            PermissionNumber = rand.nextInt(100000);//get number lessthan 100000 
                        } else if (nationality == 2) { 
                            System.out.println("enter your visa number please"); 
                            NationalNumber = s.nextInt(); 
                            UserNationality = "not Saudi"; 
                            System.out.println("enter date of expiration"); 
                            int enddate = s.nextInt(); 
                            if (IsVisaValid(enddate)) { 
                                PermissionNumber = rand.nextInt(100000); 
                            } else { 
                                System.out.println(TEXT_RED + "Permission refused. The valid visa is only 2023 or after.");  
                               return;
 
                            } 
                        } else { 
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!");
                            System.out.println(TEXT_RED+"You Enter Wrong Choose");//We show a message to the user: You have entered a wrong choice
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!"); 
                            System.out.println(TEXT_BLUE + "Please Enter 1 or 2"); 
                            nationality = 3; 
                        } 
                    } while (nationality == 3);
                     
                {
                    int campaign = 0;
                    do {
                        System.out.println("-----------------------------------------------");
                        System.out.println("Do you want to subscription in one of the following Hajj campaigns?");
                        System.out.println("1-VIP campaign(Transportation-food-flight air-conditioned accommodation-medical insurance-net-Zamzam water-visiting the Museum of the Most Beautiful Names of God)14509 RS");
                        System.out.println("2-Gold campaign(transportation-food-accommodation-medical insurance-Zamzam water-visit to the Prophet's Mosque)7040 RS");
                        System.out.println("3-Silver campaign(housing - transportation - food)4508 RS");
                        System.out.print(" > Enter your choice:  ");
                        
                         campaign = s.nextInt();
                        switch (campaign) {
                            case 1:
                                Subscription = "VIP Campaign";
                                SubscriptionPrice = 14509;
                                break;
                            case 2:
                                Subscription = "Gold Campaign";
                                SubscriptionPrice = 17040;
                                break;
                            case 3:
                                Subscription = "Silver Campaign";
                                SubscriptionPrice = 4508;
                                break;
                            default:
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!");
                            System.out.println(TEXT_RED+"You Enter Wrong Choose");//We show a message to the user: You have entered a wrong choice
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!");
                                campaign=4;
                                break;
                        }
                    } while (campaign==4);
                }
                    break;

                case 2://when user enter number 2 (Umrah)
                    TypePermission = "Umrah";
                    System.out.println("enter your nationality:");
                    System.out.println("1-Saudi");
                    System.out.println("2-not Saudi");
                    System.out.print(" > Enter your choice:  ");
                    nationality = s.nextInt();

                    if (nationality == 1) {
                        System.out.println("enter your national ID number please");
                        NationalNumber = s.nextInt();
                        UserNationality = "Saudi";
                        PermissionNumber = rand.nextInt(100000);// Obtain a number between [0 - 100000]
                    } else if (nationality == 2) {
                        System.out.println("enter your Iqama/ passport number");
                        NationalNumber = s.nextInt();
                        UserNationality = "not Saudi";
                       


                    }
                    System.out.println("What a weekday You want?");
                    System.out.println(" | 1.Saturday |");
                    System.out.println(" | 2.Sunday   |");
                    System.out.println(" | 3.Monday   |");
                    System.out.println(" | 4.Tuesday  |");
                    System.out.println(" | 5.Wednesday|");
                    System.out.println(" | 6.Thursday |");
                    System.out.println(" | 7.Friday   |");
                    System.out.print(" > Enter your choice:  ");
                    weekday = s.next();
                    switch (weekday) {
                        case "1":
                            weekday = "Saturday";
                            break;
                        case "2":
                            weekday = "Sunday";
                            break;
                        case "3":
                            weekday = "Monday";
                            break;
                        case "4":
                            weekday = "Tuesday";
                            break;
                        case "5":
                            weekday = "Wednesday";
                            break;
                        case "6":
                            weekday = "Thursday";
                            break;
                        case "7":
                            weekday = "Friday";
                            break;
                        default:
                            weekday = "Wrong choose for WeekDay please ReEnter data";
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!");
                            System.out.println(TEXT_RED+"You Enter Wrong Choose");//We show a message to the user: You have entered a wrong choice
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!");
                            break;
                    }

                    System.out.println("What time slot you preferer");
                    System.out.println("1- 12:00–3:00");
                    System.out.println("2- 3:00-6:00");
                    System.out.println("3- 6:00- 9:00");
                    System.out.println("4- 9:00-12:00");
                    System.out.print(" > Enter your choice:  ");
                    time_slot = s.next();
                    switch (time_slot) {
                        case "1":
                            time_slot = "12:00–3:00";
                            break;
                        case "2":
                            time_slot = "3:00-6:00";
                            break;
                        case "3":
                            time_slot = "6:00-9:00";
                            break;
                        case "4":
                            time_slot = "9:00-12:00";
                            break;
                        default:
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!");
                            System.out.println(TEXT_RED+"You Enter Wrong Choose ");//We show a message to the user: You have entered a wrong choice
                            System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!"); 
                            break;
                    }
                        
                    System.out.println("PM or AM");
                    System.out.print(" > Enter your choice:  ");
                    time_slot = time_slot + " " + s.next();

                    System.out.println("Do You need a wheelchair \n 1-yes \n 2-No");
                    System.out.print(" > Enter your choice:  ");
                    neadwheelchair = s.nextInt();

                    if (neadwheelchair == 1) {

                        arrayWheelChair = Needwheelchair();//
                    }

                    //***************************************//
                    System.out.println("-----------------------------------------------");
                    System.out.println("Additional Services");
                    System.out.println("-----------------------------------------------");
                    AdditionalService();
                    break;
                default://If a value is chosen that is not in the instructions
                    System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!");
                    System.out.println(TEXT_RED+"You Enter Wrong Choose");//We show a message to the user: You have entered a wrong choice
                    System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!");
                    Choose = 8;// choose=8 to continues of loop 
                    break;
            }
        } while (Choose == 8);

        System.out.println(TEXT_BLUE +"Please  evaluating the quality of services, using the scale (1-5) stars as the following: ");
        UserEvulation();

        System.out.println(TEXT_RED + "---------------------------------------------------------------------");
        System.out.println(TEXT_RED + "Permission details");
        System.out.println(TEXT_RED + "---------------------------------------------------------------------");
        PrintPermissiontDetails(PermissionNumber, UserName, UserNationality, NationalNumber, UserNumber, TypePermission, weekday, time_slot, Subscription, SubscriptionPrice, arrayWheelChair);

    }

    /*
    IF the visa expiration date is 2022 or older,
    his hajj application should be refused. The valid visa is only 2023 or after.
     */
    public static boolean IsVisaValid(int exp) {
        if (exp < 2023) {
            return false;
        } else {
            return true;
        }
    }

    //Needwheelchair Service Details
    public static int[] Needwheelchair() {

        int[] wheelArray = new int[4];
        System.out.println("Please choose Type of wheelchair");
        System.out.println("0 → manual");
        System.out.println("1 → electric");
        System.out.print(" > Enter your choice:  ");
        wheelArray[0] = s.nextInt();

        System.out.println("Please choose Number of seats: 1 or 2");
        System.out.print(" > Enter your choice:  ");
        wheelArray[1] = s.nextInt();

        System.out.println("Please choose Place of Use:");
        System.out.println("1 → tawaf");
        System.out.println("2 → sai");
        System.out.println("3 → Both");
        System.out.print(" > Enter your choice:  ");
        wheelArray[2] = s.nextInt();
        wheelArray[3] = CalculatePrice(wheelArray);

        return wheelArray;
    }

    //Calculate Price for Needwheelchair Service
    public static int CalculatePrice(int[] array) {
        int price = 0;
        if (array[0] == 0) {
            switch (array[2]) {
                case 1:
                    price = 150;
                    break;
                case 2:
                    price = 100;
                    break;
                case 3:
                    price = 250;
                    break;

            }
        }
        if (array[0] == 1) {
            switch (array[2]) {
                case 1:
                    price = 100;
                    break;
                case 2:
                    price = 100;
                    break;
                case 3:
                    price = 200;
                    break;
            }
        }

        return price;
    }

    //printed permission Details
    private static void PrintPermissiontDetails(int PermissionNumber, String UserName, String UserNationality, int NationalNumber, int UserNumber, String TypePermission, String weekday, String time_slot, String Subscription, double SubscriptionPrice, int[] Needwheelchair) {

        double totalPrice = 0.0;
        System.out.println( " Permission Number : " + PermissionNumber +"\n Name : "+UserName +"\n Nationality : " + UserNationality);
        System.out.println( " National Number : " + NationalNumber + "\n Mobile Number : "  + UserNumber +  "\n Permission Type : " + TypePermission);
        if (TypePermission.equals("Umrah")) {
            System.out.println( " WeekDay: " + weekday + "\n Time Slot: " + time_slot);
            System.out.println( "*********************Additional Services***************");
            System.out.println("Transportation Service: " + Transportation + "\t Transportation Service Price : " + TransportationPrice);
            totalPrice = totalPrice + TransportationPrice;
            System.out.println( "Zamzam Water Service QTY: " + ZamzamWater + "\t Zamzam Water Service Price : " + ZamzamWaterPrice);
            totalPrice = totalPrice + ZamzamWaterPrice;
            System.out.println( TEXT_RED+"Note: Your packages will be received with the reservation number from King Fahd Gate");
            System.out.println( "Visit Museum Service: " + VisitMuseum + "\t Price: " + VisitMuseumPrice);
            totalPrice = totalPrice + VisitMuseumPrice;
            System.out.println( "*********************Needwheelchair Services***********");
            if (neadwheelchair == 1) {

                //Type
                if (Needwheelchair[0] == 0) {
                    System.out.println( "Wheelchair  Type:Manual");
                } else {
                    System.out.println( "Wheelchair  Type:Electric");
                }
                //Number of Seats
                System.out.println( "Number of Seats: " + Needwheelchair[1]);

                //Used
                System.out.println( "Place of Use: ");

                if (Needwheelchair[2] == 1) {
                    System.out.print( "Tawaf");

                } else if (Needwheelchair[2] == 2) {
                    System.out.print( "Sai");
                } else if (Needwheelchair[2] == 3) {
                    System.out.print( "Tawaf and Sai(Both)");
                } else {
                    System.out.print( "You Enter Wrong Choose");
                }

                System.out.println( "Price of Wheelchair Service: " + Needwheelchair[3]);
                totalPrice = totalPrice + Needwheelchair[3];

            } else {
                System.out.println("You do not Need wheelchair service");
            }

        } else {

            System.out.println( "*********************Subscription Services***************");
            System.out.println( "Subscription Type: " + Subscription + "\t Price of Subscription: " + SubscriptionPrice + " RS");

            totalPrice = totalPrice + SubscriptionPrice;
        }
        System.out.println( "----------------------------------------------------------------------");
        System.out.println(TEXT_BLUE + "Total Price: " + totalPrice);
        System.out.println();

    }

    //choose Transportation and Zamzam Water Services
    private static void AdditionalService() {
        //Transportation Service
        System.out.println("A-Transportation Service");
        System.out.println("1-Taxi: 50 RS");
        System.out.println("2-Bus:  20 RS");
        System.out.println("3-I don't want");
        System.out.print(" > Enter your choice:  ");
        int transChoose = s.nextInt();
        switch (transChoose) {
            case 1:
                Transportation = "Taxi";
                TransportationPrice = 50;
                break;
            case 2:
                Transportation = "Bus";
                TransportationPrice = 20;
                break;
            case 3:
                Transportation = "You Don`t Want";
                TransportationPrice = 0.0;
                break;
            default:
                System.out.println(TEXT_RED +"You Enter Wrong Choose");
                break;
        }
        //***************************
        //Zamzam Water Service
        System.out.println("B-Zamzam Water Service");
        System.out.println("1-One liter: 5 RS");
        System.out.println("2-5 liter:   15 RS");
        System.out.println("3-15 liter:  25 RS");
        System.out.println("4-I Don't want");
        System.out.print(" > Enter your choice:  ");
        int zamzamChoose = s.nextInt();
        switch (zamzamChoose) {
            case 1:
                ZamzamWater = "One liter";
                ZamzamWaterPrice = 5;
                break;
            case 2:
                ZamzamWater = "3 Liters";
                ZamzamWaterPrice = 15;
                break;
            case 3:
                ZamzamWater = "15 Liters";
                ZamzamWaterPrice = 25;
                break;
            case 4:
                ZamzamWater = "I Don't want";
                ZamzamWaterPrice = 0.0;
                break;
            default:
                System.out.println(TEXT_RED +"You Enter Wrong Choose");
                break;
        }
        //Visit the Museum of the Most Beautiful Names of God:150 RS
        System.out.println("C-Do you want to visit the Museum of the Most Beautiful Names of God?");
        System.out.println("1-Yes:150RS");
        System.out.println("2-No: 0RS");
        System.out.print(" > Enter your choice 1 or 2:  ");
        int visit = s.nextInt();
        if (visit == 1) {
            VisitMuseum = "Yes";
            VisitMuseumPrice = 150.0;
        } else {
            VisitMuseum = "No";
            VisitMuseumPrice = 0.0;
        }
    }

    private static void UserEvulation() {
        int evulation;
        do {
            System.out.println("1 star  → strongly unsatisfied ( ͡❛ ︹ ͡❛)");
            System.out.println("2 stars → unsatisfied (❛︣ ︹ ❛︣)");
            System.out.println("3 stars → satisfied ( ͡❛ - ͡❛)");
            System.out.println("4 stars → strongly satisfied ( ͡❛ ͜ʖ ͡❛)");
            System.out.println("5 stars → outstanding ( ͡❛ ‿ ͡❛)");
            System.out.print(" > Enter your choice:  ");
            Scanner input = new Scanner(System.in);
            evulation = input.nextInt();

            switch (evulation) {

                case 1: //When evaluating the user 1 star
                    Evulation = "strongly unsatisfied";
                    System.out.println("");
                    break;

                case 2: //When evaluating the user 2 stars
                    Evulation = "unsatisfied";
                    System.out.println("");
                    break;

                case 3: //When evaluating the user 3 stars
                    Evulation = "satisfied";
                    System.out.println("");
                    break;

                case 4: //When evaluating the user 4 stars
                    Evulation = "strongly satisfied";
                    System.out.println("");
                    break;

                case 5: //When evaluating the user 5 stars
                    Evulation = "outstanding";
                    System.out.println("");
                    break;

                default:
                    System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!\n");
                    System.out.println(TEXT_RED +"You Enter Wrong choice please enter correct choice");
                    System.out.println("!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!");
                    evulation = 6;
                    break;
            }
 
            System.out.println("THANK YOU"); 
            
        } while (evulation == 6);
    
    
    
    
    
    }   
    
}
