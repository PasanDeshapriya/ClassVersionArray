import java.util.ArrayList;

public class passenger {

//array used to store first name and others
    public static String[][] FirstName = new String[5][6];
    public static String[][] SecondName = new String[5][6];
    public static String[][] VehicleNo = new String[5][6];
    public static Double[][] NumLiters = new Double[5][6];


//This is created because queue don't have a limit, so it must have infinite amount of inputs so arraylist is used
    public  static ArrayList<String> QueueFirstName= new ArrayList<String>();
    public  static ArrayList<String> QueueSecondName= new ArrayList<String>();
    public  static ArrayList<String> QueueVehicleNo= new ArrayList<String>();
    public  static ArrayList<Double> QueueNumLiters= new ArrayList<Double>();

//boolean pump is used to validation
    public static Boolean[] pump1 = new Boolean[6];
    public static Boolean[] pump2 = new Boolean[6];
    public static Boolean[] pump3 = new Boolean[6];
    public static Boolean[] pump4 = new Boolean[6];
    public static Boolean[] pump5 = new Boolean[6];
}
