import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        LOOP();
    }

    public  static void LOOP() {
        menu();
        System.out.println("\n pls choose an option ");
        String choice = scanner.next();
//each options relative  function  is called via a case loop
        switch (valid(choice)) {
            case 0 -> FuelQueue.VFQ();
            case 1 -> FuelQueue.VEQ();
            case 2 -> FuelQueue.ACQ();
            case 3 -> FuelQueue.RCQ();
            case 4 -> FuelQueue.PCQ();
            case 5 -> FuelQueue.VCS();
            case 6 -> FuelQueue.SPD();
            case 7 -> FuelQueue.LPD();
            case 8 -> FuelQueue.STK();
            case 9 -> FuelQueue.AFS();
            case 10-> FuelQueue.IFQ();
            case 11-> FuelQueue.EXT();

//if the user input something other than the given options a message will pop up informing about it
            case 100 -> System.out.println("\nYou have selected a wrong option !\n");
        }
//this is used to exit the loop
        if(FuelQueue.loop){
            //infinite times of repetition unit loop is false (it means when 999 or EXT is entered)
            LOOP();
        }else{
            System.out.println("\nThank you for using this program ");
        }

    }

    public  static void menu() {
        System.out.println("---------------MENU--------------\n" +
                "   100 or VFQ: View all Fuel Queues.\n" +
                "   101 or VEQ: View all Empty Queues.\n" +
                "   102 or ACQ: Add customer to a Queue.\n" +
                "   103 or RCQ: Remove a customer from a Queue. (From a specific location)\n" +
                "   104 or PCQ: Remove a served customer.\n" +
                "   105 or VCS: View Customers Sorted in alphabetical order\n" +
                "   106 or SPD: Store Program Data into file. 107 or LPD: Load Program Data from file.\n" +
                "   107 or LPD: Load Program Data from file\n" +
                "   108 or STK: View Remaining Fuel Stock.\n" +
                "   109 or AFS: Add Fuel Stock.\n" +
                "   110 or IFQ: View the income per line in each queue.\n" +
                "   999 or EXT: Exit the Program.\n" +
                "-------------------------------------------");

    }

    public static Integer valid(String choice) {
        String[][] choice1 = {{"100", "101", "102", "103", "104", "105", "106", "107", "108", "109","110", "999"}, {"VFQ", "VEQ", "ACQ", "RCQ", "PCQ", "VCS", "SPD", "LPD", "STK", "AFS","IFQ", "EXT"}};
        int num = 100;
        for (int i = 0; i < 12; i++) {
            if ((Objects.equals(choice1[0][i], choice)) || (Objects.equals(choice1[1][i], choice))) {
                //value of i is saved in num, so we can use it later
                System.out.println("you choose " + choice1[0][i] + ", " + choice1[1][i]);
                num = i;
                break;
            }
        }
        return num;
    }

}
