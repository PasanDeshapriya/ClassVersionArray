import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class FuelQueue {

    public static Scanner scanner = new Scanner(System.in);

//count is used to store the length of the array, so it can be later used.
    public static int count1 = 0;
    public static int count2 = 0;
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;

//low array is set to find the array with the lowest number of customers
    public static int low[] = new int[5];
    public static int stock = 6600;
    public static boolean loop = true;

    public static void VFQ(){

        int out = 0;
        int in = 0;
        System.out.println("View all Fuel Queues");
        for (out = 0; out < 5; out++) {
            for (in = 0; in < 6; in++) {
                if (passenger.FirstName[out][in] == null) {
                    System.out.println("pump " + out + ",row " + in + " : empty");

                } else  {
                    System.out.println("pump " + out + ",row " + in + " : "+passenger.FirstName[out][in]+" "+passenger.SecondName[out][in]);
                }
            }
        }
    }

    public static void VEQ(){
        int out = 0;
        int in = 0;
        System.out.println("View all Empty Queues.");
        for (out = 0; out < 5; out++) {
            for (in = 0; in < 6; in++) {
                if (passenger.FirstName[out][in] == null) {
                    System.out.println("pump " + out + ",row " + in + " is empty");
                }
            }
        }
    }

    public static void ACQ(){

        int in = 0;
        int out = 0;
//sort low will find the pump queue with the lowest no of customers
        SortLow();
        System.out.println("Add customer to a Queue");
//if the queue is full the customer is added to the waiting list (if the queue is full the length of the array must be 6 )
        if(count1==6 && count2==6 && count3==6 && count4==6 && count5==6) {
            System.out.println("All the pumps are full");
            System.out.println("You are been added to the waiting list.");
            System.out.println("pls enter customer First name");
            String name;
//this is validation if the user didn't input  it won't let the  user from going into the next input until the user enters an input
            do{
                if(scanner.hasNext()){
                    name = scanner.next();
                    break;
                }else{
                    scanner.next();
                }
            }while(true);
            passenger.QueueFirstName.add(name);
//this is validation if the user didn't input  it won't let the  user from going into the next input until the user enters an input
            System.out.println("pls enter customer Second name");
            do{
                if(scanner.hasNext()){
                    name = scanner.next();
                    break;

                }else{
                    scanner.next();

                }
            }while(true);
            passenger.QueueSecondName.add(name);
//this is validation if the user didn't input  it won't let the  user from going into the next input until the user enters an input
            System.out.println("pls enter customer Vehicle number ");
            String Vnum;
            do{
                if(scanner.hasNext()){
                    Vnum = scanner.next();
                    break;

                }else{
                    scanner.next();

                }
            }while(true);
            passenger.QueueVehicleNo.add(Vnum);

//This to validate whether the user has input a double number
            do{
                System.out.println("pls enter  number of liters that the customer wants to buy? ");
                String num = scanner.next();
                try
                {
                    Double.parseDouble(num);
                    double numD=Double.parseDouble(num);
                    passenger.QueueNumLiters.add(numD);
                    break;
                }
                catch (NumberFormatException e)
                {
                    System.out.println(num + " is not a valid input !");
                    scanner.next();
                }
            }while(true);
//the size is minus one coz the size  starts from  1, but the array starts from 0
            int size=passenger.QueueFirstName.size()-1;
            System.out.println("a customer called "+passenger.QueueFirstName.get(size)+" "+passenger.QueueFirstName.get(size)+ " is added to waiting list in "+size+" position.");



        }else if((count1==low[0] && count2==low[0] && count3==low[0] && count4==low[0] && count5==low[0])){
            for (in = 0; in < 6; in++) {
                if (Objects.equals(passenger.FirstName[0][in], null)) {
                    System.out.println("pls enter customer First name");
                    String name;
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.FirstName[0][in]=name;

                    System.out.println("pls enter customer Second name");
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.SecondName[0][in]=name;

                    System.out.println("pls enter customer Vehicle number ");
                    String Vnum;
                    do{
                        if(scanner.hasNext()){
                            Vnum = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.VehicleNo[0][in]=Vnum;

                    do{
                        System.out.println("pls enter  number of liters that the customer wants to buy? ");
                        String num = scanner.next();
                        try
                        {
                            Double.parseDouble(num);
                            double numD=Double.parseDouble(num);
                            passenger.NumLiters[0][in]=numD;
                            break;
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(num + " is not a valid input !");
                            scanner.next();
                        }
                    }while(true);
//count is add one to increase by one because a customer is added
                    count1+=1;
                    passenger.pump1[in]=true;
                    System.out.println("a customer called "+passenger.FirstName[0][in]+" "+passenger.SecondName[0][in]+ " is Successfully added to pump  0, row " + in+ ".");
                    break;
                }
            }


        }else if(count1==low[0]){
            for (in = 0; in < 6; in++) {
                if (Objects.equals(passenger.FirstName[0][in], null)) {
                    System.out.println("pls enter customer First name");
                    String name;
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.FirstName[0][in]=name;

                    System.out.println("pls enter customer Second name");
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.SecondName[0][in]=name;

                    System.out.println("pls enter customer Vehicle number ");
                    String Vnum;
                    do{
                        if(scanner.hasNext()){
                            Vnum = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.VehicleNo[0][in]=Vnum;

                    do{
                        System.out.println("pls enter  number of liters that the customer wants to buy? ");
                        String num = scanner.next();
                        try
                        {
                            Double.parseDouble(num);
                            double numD=Double.parseDouble(num);
                            passenger.NumLiters[0][in]=numD;
                            break;
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(num + " is not a valid input !");
                            scanner.next();
                        }
                    }while(true);

                    count1+=1;
                    passenger.pump1[in]=true;
                    System.out.println("a customer called "+passenger.FirstName[0][in]+" "+passenger.SecondName[0][in]+ " is Successfully added to pump  0, row " + in+ ".");
                    break;
                }
            }

        }else if(count2==low[0]){
            for (in = 0; in < 6; in++) {
                if (Objects.equals(passenger.FirstName[1][in], null)) {
                    System.out.println("pls enter customer First name");
                    String name;
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.FirstName[1][in]=name;

                    System.out.println("pls enter customer Second name");
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.SecondName[1][in]=name;

                    System.out.println("pls enter customer Vehicle number ");
                    String Vnum;
                    do{
                        if(scanner.hasNext()){
                            Vnum = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.VehicleNo[1][in]=Vnum;

                    do{
                        System.out.println("pls enter  number of liters that the customer wants to buy? ");
                        String num = scanner.next();
                        try
                        {
                            Double.parseDouble(num);
                            double numD=Double.parseDouble(num);
                            passenger.NumLiters[1][in]=numD;
                            break;
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(num + " is not a valid input !");
                            scanner.next();
                        }
                    }while(true);

                    count2+=1;
                    passenger.pump2[in]=true;
                    System.out.println("a customer called "+passenger.FirstName[1][in]+" "+passenger.SecondName[1][in]+ " is Successfully added to pump  1, row " + in+ ".");
                    break;
                }
            }
        }else if(count3==low[0]){
            for (in = 0; in < 6; in++) {
                if (Objects.equals(passenger.FirstName[2][in], null)) {
                    System.out.println("pls enter customer First name");
                    String name;
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.FirstName[2][in]=name;

                    System.out.println("pls enter customer Second name");
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.SecondName[2][in]=name;

                    System.out.println("pls enter customer Vehicle number ");
                    String Vnum;
                    do{
                        if(scanner.hasNext()){
                            Vnum = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.VehicleNo[2][in]=Vnum;

                    do{
                        System.out.println("pls enter  number of liters that the customer wants to buy? ");
                        String num = scanner.next();
                        try
                        {
                            Double.parseDouble(num);
                            double numD=Double.parseDouble(num);
                            passenger.NumLiters[2][in]=numD;
                            break;
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(num + " is not a valid input !");
                            scanner.next();
                        }
                    }while(true);

                    count3+=1;
                    passenger.pump3[in]=true;
                    System.out.println("a customer "+passenger.FirstName[2][in]+" "+passenger.SecondName[2][in]+ " is Successfully added to pump  2, row " + in+ ".");
                    break;
                }
            }
        }else if(count4==low[0]){
            for (in = 0; in < 6; in++) {
                if (Objects.equals(passenger.FirstName[3][in], null)) {
                    System.out.println("pls enter customer First name");
                    String name;
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.FirstName[3][in]=name;

                    System.out.println("pls enter customer Second name");
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.SecondName[3][in]=name;

                    System.out.println("pls enter customer Vehicle number ");
                    String Vnum;
                    do{
                        if(scanner.hasNext()){
                            Vnum = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.VehicleNo[3][in]=Vnum;

                    do{
                        System.out.println("pls enter  number of liters that the customer wants to buy? ");
                        String num = scanner.next();
                        try
                        {
                            Double.parseDouble(num);
                            double numD=Double.parseDouble(num);
                            passenger.NumLiters[3][in]=numD;
                            break;
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(num + " is not a valid input !");
                            scanner.next();
                        }
                    }while(true);

                    count4+=1;
                    passenger.pump4[in]=true;
                    System.out.println("a customer called "+passenger.FirstName[3][in]+" "+passenger.SecondName[3][in]+ " is Successfully added to pump  3, row " + in+ ".");
                    break;
                }
            }
        }else if(count5==low[0]){
            for (in = 0; in < 6; in++) {
                if (Objects.equals(passenger.FirstName[4][in], null)) {
                    System.out.println("pls enter customer First name");
                    String name;
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.FirstName[4][in]=name;

                    System.out.println("pls enter customer Second name");
                    do{
                        if(scanner.hasNext()){
                            name = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.SecondName[4][in]=name;

                    System.out.println("pls enter customer Vehicle number ");
                    String Vnum;
                    do{
                        if(scanner.hasNext()){
                            Vnum = scanner.next();
                            break;

                        }else{
                            scanner.next();

                        }
                    }while(true);
                    passenger.VehicleNo[4][in]=Vnum;

                    do{
                        System.out.println("pls enter  number of liters that the customer wants to buy? ");
                        String num = scanner.next();
                        try
                        {
                            Double.parseDouble(num);
                            double numD=Double.parseDouble(num);
                            passenger.NumLiters[4][in]=numD;
                            break;
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println(num + " is not a valid input !");
                            scanner.next();
                        }
                    }while(true);

                    count5+=1;
                    passenger.pump5[in]=true;
                    System.out.println("a customer called "+passenger.FirstName[4][in]+" "+passenger.SecondName[4][in]+ " is Successfully added to pump  4, row " + in+ ".");
                    break;
                }
            }
        }
    }

    public static void RCQ() {
        System.out.println("Remove a customer from a Queue. (From a specific location)");
        int out = 0;
        int in = 0;
//the location is asked from the user if there is no one in that location a message is sent to inform that no one is there
//if there is the location is turned null

        System.out.println("pls enter from which row you want to remove(0,1,2,3,4)");
        out = scanner.nextInt();
        System.out.println("pls enter from which column you want to remove(0,1,2,3,4,5)");
        in = scanner.nextInt();
        if (Objects.equals(passenger.FirstName[out][in], null)) {
            System.out.println("there is no customer at the given location");
        } else {
            passenger.FirstName[out][in] = null;
            System.out.println("pump " + out + ",row " + in + " customer has been removed.");
//bubble sort is done here so that the removed slot is moved to the end of the queue and the customers are sent front
            for (int inLoop = in + 1; inLoop < 6; inLoop++) {
                if (passenger.FirstName[out][inLoop] != null) {
                    String temp = passenger.FirstName[out][inLoop - 1];
                    passenger.FirstName[out][inLoop - 1] = passenger.FirstName[out][inLoop];
                    passenger.FirstName[out][inLoop] = temp;

                    temp = passenger.SecondName[out][inLoop - 1];
                    passenger.SecondName[out][inLoop - 1] = passenger.SecondName[out][inLoop];
                    passenger.SecondName[out][inLoop] = temp;

                    temp = passenger.VehicleNo[out][inLoop - 1];
                    passenger.VehicleNo[out][inLoop - 1] = passenger.VehicleNo[out][inLoop];
                    passenger.VehicleNo[out][inLoop] = temp;

//null is not valid in double so if the num is null it is assign 0.0 and then the bubble sort is done
//this is because the num variable is double (like temp)
                    if(passenger.NumLiters[out][inLoop - 1]==null){
                        passenger.NumLiters[out][inLoop - 1]=0.0;
                    }
                    double num = passenger.NumLiters[out][inLoop - 1];
                    passenger.NumLiters[out][inLoop - 1] = passenger.NumLiters[out][inLoop];
                    passenger.NumLiters[out][inLoop] = num;
                    if(passenger.NumLiters[out][inLoop]==0.0){
                        passenger.NumLiters[out][inLoop]=null;
                    }
//the pump arrays are done the same thing(bubble sort)
                    if(out==0){
                        Boolean cho = passenger.pump1[inLoop - 1];
                        passenger.pump1[inLoop - 1] = passenger.pump1[inLoop];
                        passenger.pump1[inLoop] = cho;
                    }else if(out==1){
                        Boolean cho = passenger.pump2[inLoop - 1];
                        passenger.pump2[inLoop - 1] = passenger.pump2[inLoop];
                        passenger.pump2[inLoop] = cho;
                    }else if(out==2) {
                        Boolean cho = passenger.pump3[inLoop - 1];
                        passenger.pump3[inLoop - 1] = passenger.pump3[inLoop];
                        passenger.pump3[inLoop] = cho;
                    }else if(out==3) {
                        Boolean cho = passenger.pump4[inLoop - 1];
                        passenger.pump4[inLoop - 1] = passenger.pump4[inLoop];
                        passenger.pump4[inLoop] = cho;
                    }else{
                        Boolean cho = passenger.pump5[inLoop - 1];
                        passenger.pump5[inLoop - 1] =passenger.pump5[inLoop];
                        passenger.pump5[inLoop] = cho;
                    }

                } else{
                    break;

                }

            }
//count is removed
            if(out==0){
                count1-=1;
            }else if(out==1){
                count2-=1;
            }else if(out==2){
                count3-=1;
            }else if(out==3){
                count4-=1;
            }else if(out==4){
                count5-=1;
            }


        }

    }

    public static void PCQ() {
        System.out.println("Remove a served customer.");
        int out = 0;

        if(stock==0){
            System.out.println("NO stocks remaining");
        }else {
            System.out.println("pls enter from which row you want to remove(0,1,2,3,4)");
            out = scanner.nextInt();
            for (int in = 0; in < 6; in++) {
                if (!Objects.equals(passenger.FirstName[out][in], null)) {
                    System.out.println("pump " + out + ",row " + in + " severed customer has been removed.");
                    passenger.FirstName[out][in] = null;
                    passenger.SecondName[out][in] = null;
                    passenger.VehicleNo[out][in] = null;
                    stock -= passenger.NumLiters[out][in];
                    passenger.NumLiters[out][in] = null;



                    for (int inLoop = in+ 1; inLoop < 6; inLoop++) {

                        String temp = passenger.FirstName[out][inLoop - 1];
                        passenger.FirstName[out][inLoop - 1] = passenger.FirstName[out][inLoop];
                        passenger.FirstName[out][inLoop] = temp;

                        temp = passenger.SecondName[out][inLoop - 1];
                        passenger.SecondName[out][inLoop - 1] = passenger.SecondName[out][inLoop];
                        passenger.SecondName[out][inLoop] = temp;

                        temp = passenger.VehicleNo[out][inLoop - 1];
                        passenger.VehicleNo[out][inLoop - 1] = passenger.VehicleNo[out][inLoop];
                        passenger.VehicleNo[out][inLoop] = temp;


                        if(passenger.NumLiters[out][inLoop - 1]==null){
                            passenger.NumLiters[out][inLoop - 1]=0.0;
                        }
                        double num = passenger.NumLiters[out][inLoop - 1];
                        passenger.NumLiters[out][inLoop - 1] = passenger.NumLiters[out][inLoop];
                        passenger.NumLiters[out][inLoop] = num;
                        if(passenger.NumLiters[out][inLoop]==0.0){
                            passenger.NumLiters[out][inLoop]=null;
                        }

                        if(out==0){
                            Boolean cho = passenger.pump1[inLoop - 1];
                            passenger.pump1[inLoop - 1] = passenger.pump1[inLoop];
                            passenger.pump1[inLoop] = cho;
                        }else if(out==1){
                            Boolean cho = passenger.pump2[inLoop - 1];
                            passenger.pump2[inLoop - 1] = passenger.pump2[inLoop];
                            passenger.pump2[inLoop] = cho;
                        }else if(out==2) {
                            Boolean cho = passenger.pump3[inLoop - 1];
                            passenger.pump3[inLoop - 1] = passenger.pump3[inLoop];
                            passenger.pump3[inLoop] = cho;
                        }else if(out==3) {
                            Boolean cho = passenger.pump4[inLoop - 1];
                            passenger.pump4[inLoop - 1] = passenger.pump4[inLoop];
                            passenger.pump4[inLoop] = cho;
                        }else{
                            Boolean cho = passenger.pump5[inLoop - 1];
                            passenger.pump5[inLoop - 1] = passenger.pump5[inLoop];
                            passenger.pump5[inLoop] = cho;
                        }

                    }
//this is done if there is customers waiting in the waiting list
//when the first customer in the waiting list is added to the queue the position of the customer in the waiting list is removed
//in arraylist when the first customer is removed (0) the second customer in the waiting list become (0)
                    for (int inLoop =0; inLoop < 6; inLoop++) {
                        if (passenger.FirstName[out][inLoop] == null) {
                            try {
                                if (passenger.QueueFirstName.get(0) != null) {
                                    passenger.FirstName[out][inLoop] = passenger.QueueFirstName.get(0);
                                    passenger.QueueFirstName.remove(0);

                                    passenger.SecondName[out][inLoop] = passenger.QueueSecondName.get(0);
                                    passenger.QueueSecondName.remove(0);

                                    passenger.VehicleNo[out][inLoop] = passenger.QueueVehicleNo.get(0);
                                    passenger.QueueVehicleNo.remove(0);

                                    passenger.NumLiters[out][inLoop] = passenger.QueueNumLiters.get(0);
                                    passenger.QueueVehicleNo.remove(0);
                                    break;
                                }
                            }catch (IndexOutOfBoundsException nfe){
                                break;
                            }

                        }
                    }
                    if(out==0){
                        count1-=1;
                    }else if(out==1){
                        count2-=1;
                    }else if(out==2){
                        count3-=1;
                    }else if(out==3){
                        count4-=1;
                    }else if(out==4){
                        count5-=1;
                    }

                    break;



                } else if(in==5) {
                    System.out.println("pump " + out + " has no customers.");

                }

            }
            if(stock<=500){
                System.out.println("Only "+stock+" liters stocks remaining");
            }
        }
    }

    public static void VCS() {
        int out = 0;
        int in = 0;
        int count=0;
//2 temporally arrays has been introduced

        String[][] Alphabet = new String[5][6];
        String[][] Alphabet2 = new String[5][6];


//they are assign the first name and second name
        for (int outLoop = 0; outLoop < 5; outLoop++) {
            for (int inLoop = 0; inLoop < 6; inLoop++) {
                Alphabet[outLoop][inLoop]=passenger.FirstName[outLoop][inLoop];
                Alphabet2[outLoop][inLoop]=passenger.SecondName[outLoop][inLoop];
            }
        }
//here the compare function is used instead of sort
//if the .compare to is greater than 0 it is moved forward
//like bubble sort
        //0
        boolean fo=true;
        while(fo){
            for (in= 0;in <Alphabet.length; in++){
                if(Alphabet[0][in+1]!=null ){
                    if(Alphabet[0][in].compareTo(Alphabet[0][in+1])>0){

                        String temp = Alphabet[0][in];
                        Alphabet[0][in] =Alphabet[0][in+1];
                        Alphabet[0][in+1]=temp;

                        temp = Alphabet2[0][in];
                        Alphabet2[0][in] =Alphabet2[0][in+1];
                        Alphabet2[0][in+1]=temp;
                    }
                }
                count++;
            }
            if(Alphabet.length*Alphabet.length==count){
                fo=false;
            }
        }
        //1
        out = 0;
        in = 0;
        count=0;
        fo=true;
        while(fo){
            for (in= 0;in <Alphabet.length; in++){
                if(Alphabet[1][in+1]!=null ){
                    if(Alphabet[1][in].compareTo(Alphabet[1][in+1])>0){

                        String temp = Alphabet[1][in];
                        Alphabet[1][in] =Alphabet[1][in+1];
                        Alphabet[1][in+1]=temp;

                        temp = Alphabet2[1][in];
                        Alphabet2[1][in] =Alphabet2[1][in+1];
                        Alphabet2[1][in+1]=temp;
                    }
                }
                count++;
            }
            if(Alphabet.length*Alphabet.length==count){
                fo=false;
            }
        }
        //2
        out= 0;
        in= 0;
        count=0;
        fo=true;
        while(fo){
            for (in= 0;in <Alphabet.length; in++){
                if(Alphabet[2][in+1]!=null ){
                    if(Alphabet[2][in].compareTo(Alphabet[2][in+1])>0){

                        String temp = Alphabet[2][in];
                        Alphabet[2][in] =Alphabet[2][in+1];
                        Alphabet[2][in+1]=temp;

                        temp = Alphabet2[2][in];
                        Alphabet2[2][in] =Alphabet2[2][in+1];
                        Alphabet2[2][in+1]=temp;
                    }
                }
                count++;
            }
            if(Alphabet.length*Alphabet.length==count){
                fo=false;
            }
        }
        //3
        out= 0;
        in= 0;
        count=0;
        fo=true;
        while(fo){
            for (in= 0;in <Alphabet.length; in++){
                if(Alphabet[3][in+1]!=null ){
                    if(Alphabet[3][in].compareTo(Alphabet[3][in+1])>0){

                        String temp = Alphabet[3][in];
                        Alphabet[3][in] =Alphabet[3][in+1];
                        Alphabet[3][in+1]=temp;

                        temp = Alphabet2[3][in];
                        Alphabet2[3][in] =Alphabet2[3][in+1];
                        Alphabet2[3][in+1]=temp;
                    }
                }
                count++;
            }
            if(Alphabet.length*Alphabet.length==count){
                fo=false;
            }
        }
        //4
        out= 0;
        in= 0;
        count=0;
        fo=true;
        while(fo){
            for (in= 0;in <Alphabet.length; in++){
                if(Alphabet[4][in+1]!=null ){
                    if(Alphabet[4][in].compareTo(Alphabet[4][in+1])>0){

                        String temp = Alphabet[4][in];
                        Alphabet[4][in] =Alphabet[4][in+1];
                        Alphabet[4][in+1]=temp;

                        temp = Alphabet2[4][in];
                        Alphabet2[4][in] =Alphabet2[4][in+1];
                        Alphabet2[4][in+1]=temp;
                    }
                }
                count++;
            }
            if(Alphabet.length*Alphabet.length==count){
                fo=false;
            }
        }
//the newly sorted array is displayed
        for (int outLoop = 0; outLoop < 5; outLoop++) {
            for (int inLoop = 0; inLoop < 6; inLoop++) {
                if (Alphabet[outLoop][inLoop] == null) {
                    System.out.println("pump " + outLoop + ",row " + inLoop + " : empty");

                } else  {
                    System.out.println("pump " + outLoop + ",row " + inLoop + " : "+Alphabet[outLoop][inLoop]+" "+Alphabet2[outLoop][inLoop]);
                }
            }
        }
    }


    //store data into a file
    //a txt file is created and then the data is written into it
    public static void SPD() {
        System.out.println("Store Program Data into file.");
        int out=0;
        int in=0;
        int size=0;
        System.out.println("please enter the file name ");
        String fileName=scanner.nextLine();

        try {
            File txt = new File(fileName+".txt");
            boolean x = (txt.createNewFile());
            if (!x) {
                System.out.println("You have already created txt file using this name!");
            } else {
                PrintWriter writeFile = new PrintWriter(txt);
                for (out = 0; out < 5; out++) {
                    for (in = 0; in < 6; in++) {
                        if (passenger.FirstName[out][in] == null) {
                            writeFile.println("pump " + out + ",row " + in + " is empty");
                        }else{
                            writeFile.println("pump " + out + ",row " + in + " : "+passenger.FirstName[out][in]+" "+passenger.SecondName[out][in]);
                            writeFile.println("Vehicle number :"+passenger.VehicleNo[out][in]+", Number of liters ordered :"+passenger.NumLiters[out][in]);
                        }
                    }
                }
//waiting list is added
                size=passenger.QueueFirstName.size()-1;
                writeFile.println("Waiting list" );
                for(int count=0;count<size;count++){
                    writeFile.println(count+": "+passenger.QueueFirstName.get(size)+" "+passenger.QueueSecondName.get(size));
                    writeFile.println("Vehicle number :"+passenger.QueueVehicleNo.get(size)+", Number of liters ordered :"+passenger.QueueNumLiters.get(size));
                }
                writeFile.close();
                System.out.println("\ndata saved into file");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
        }
    }

    //load data from a file
//searches for a file name if the name is not available a message is given
//if the filename is available the content of the filename is shown
    public static void LPD() {
        System.out.println("Load Program Data from file.");
        System.out.println("please enter the file name ");
        String fileName=scanner.nextLine();
        try{
            FileReader load = new FileReader(fileName+".txt");
            int line = load.read();
            while(line != -1){
                System.out.print((char)line);
                line=load.read();
            }
            load.close();
        }catch(Exception e){
            System.out.println("couldn't find a file named "+fileName);
        }
    }

    public static void STK() {
        System.out.println("View Remaining Fuel Stock.");
        System.out.println(stock);
    }

    public static void AFS() {
        System.out.println("Add Fuel Stock.");
        System.out.println("Enter the amount of stock to add.");
        int addStock= scanner.nextInt();
        stock+=addStock;

    }

    //shows the income per queue
    public static void IFQ() {

        for( int out=0;out<5;out++){
            double tot=0;
            for (int in = 0; in < 6; in++) {
                if (passenger.FirstName[out][in] != null) {
                    tot+=passenger.NumLiters[out][in] * 430;
                }
            }
            System.out.println("the total income in queue "+out+" is "+tot);
        }
    }



//exits the program
//the loop variable is turned false

    public static void EXT() {
        System.out.println("Exit the Program.");
        loop = false;
    }

//this function is used to sort the lengths of each queue from lowest to the largest
//each count with a number (eg: count1)  contains a length of a queue (eg: count1=queue0)
//each count is assign a position in the low array

    public static void SortLow() {
        int count = 0;
        int temp = 0;
        low[0] = count1;
        low[1] = count2;
        low[2] = count3;
        low[3] = count4;
        low[4] = count5;
        boolean fo = true;
//then bubble sort is done to  arrange the array from the lowest count value to the largest
        while (fo) {
            if(low[0]>low[1]){
                temp = low[0];
                low[0] = low[1];
                low[1] = temp;
            }
            if(low[1]>low[2]){
                temp = low[2];
                low[2] = low[1];
                low[1] = temp;
            }
            if(low[2]>low[3]){
                temp = low[2];
                low[2] = low[3];
                low[3] = temp;
            }if(low[3]>low[4]){
                temp = low[3];
                low[3] = low[4];
                low[4] = temp;
            }
            count++;
            if (25== count) {
                fo = false;
            }

        }
    }
}
