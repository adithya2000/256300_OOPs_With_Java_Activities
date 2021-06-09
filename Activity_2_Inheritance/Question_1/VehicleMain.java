package Question_1;
import java.util.*;
public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Four Wheeler");
        System.out.println("2. Two Wheeler");
        System.out.println("Enter Vehicle Type");
        int type=sc.nextInt();
        if(type==1){
            System.out.println("Vehicle Make:");
            String make=sc.next();
            System.out.println("Vehicle Number:");
            String Vnumber=sc.next();
            System.out.println("Fuel type:");
            System.out.println("1. Petrol");
            System.out.println("2. Diesel");
            String fType=sc.next();
            System.out.println("Fuel Capacity:");
            int cap=sc.nextInt();
            System.out.println("Engine CC:");
            int cc=sc.nextInt();
           
           System.out.println("Audio System: ");
           String au=sc.next();
           System.out.println("Number of Doors: ");
           int doo=sc.nextInt();
          Vehicle c=new FourWheeler(make,Vnumber,fType,cap,cc,au,doo);
           c.displayMake();
           c.displayBasicInfo();;
           c.displayDetailInfo();
        }
        else{
            System.out.println("Vehicle Make:");
            String make=sc.next();
            System.out.println("Vehicle Number:");
            String Vnumber=sc.next();
            System.out.println("Fuel type:");
            System.out.println("1. Petrol");
            System.out.println("2. Diesel");
            String fType=sc.next();
            System.out.println("Fuel Capacity:");
            int cap=sc.nextInt();
            System.out.println("Engine CC:");
            int cc=sc.nextInt();
           
            System.out.println("Kick Start Available(yes/no):");
            boolean ans= (sc.next().equals("yes"))?true:false;
            Vehicle v=new TwoWheeler(make, Vnumber, fType, cap, cc, ans);
            v.displayMake();
            v.displayBasicInfo();
            v.displayDetailInfo();


        }
        sc.close();
    }
    
}
