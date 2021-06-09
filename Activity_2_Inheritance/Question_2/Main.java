package Question_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hotel Tariff Calculator");
        System.out.println("1. Deluxe Room");
        System.out.println("2. Deluxe AC Room");
        System.out.println("3. Suite AC Room");
        System.out.println("Select Room Type:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Hotel Name:");
            String name=sc.next();
            System.out.println("Room Square Feet Area:");
            int area=sc.nextInt();
            System.out.println("Room has TV(yes/no):");
            boolean tv=(sc.next().equals("yes"))?true:false;;
            System.out.println("Room has Wifi(yes/no):");
            boolean wifi=(sc.next().equals("yes"))?true:false;;
            DeluxeRoom r= new DeluxeRoom(name,area,tv,wifi);
            int rate=r.getRatePerSqFeet();
            System.out.println("Room Tariff per day is:"+r.calculateTariff(rate));

        }
        else if(n==2){
            System.out.println("Hotel Name:");
            String name=sc.next();
            System.out.println("Room Square Feet Area:");
            int area=sc.nextInt();
            System.out.println("Room has TV(yes/no):");
            boolean tv= (sc.next().equals("yes"))?true:false;
            System.out.println("Room has Wifi(yes/no):");
            boolean wifi= (sc.next().equals("yes"))?true:false;
            DeluxeAcRoom d=new DeluxeAcRoom(name,area,tv,wifi);
            int rate=d.getRatePerSqFeet();
            System.out.println("Room Tariff per day is:"+d.calculateTariff(rate));
            
        }
        else if(n==3){
            System.out.println("Hotel Name:");
            String name=sc.next();
            System.out.println("Room Square Feet Area:");
            int area=sc.nextInt();
            System.out.println("Room has TV(yes/no):");
            boolean tv=(sc.next().equals("yes"))?true:false;
            System.out.println("Room has Wifi(yes/no):");
            boolean wifi=(sc.next().equals("yes"))?true:false;
            SuiteACRoom s=new SuiteACRoom(name,area,tv,wifi);
            int rate=s.getRatePerSqFeet();
            System.out.println("Room Tariff per day is:"+s.calculateTariff(rate));
            


        }
        sc.close();
    }
    
}
