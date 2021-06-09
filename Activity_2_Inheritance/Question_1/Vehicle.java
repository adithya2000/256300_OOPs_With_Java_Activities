package Question_1;


public class Vehicle {
    protected String make,vechileNumber,fuelType;
    protected int fuelCapacity,cc;
    
    Vehicle(String make,String vechileNumber,String fuelType,int fuelCapacity,int cc){
        this.make=make;
        this.vechileNumber=vechileNumber;
        this.fuelType=fuelType;
        this.fuelCapacity=fuelCapacity;
        this.cc=cc;
    }
    public void displayMake(){
        System.out.println("***"+make+"***");
        
    }
    public void displayBasicInfo(){
        System.out.println("---Basic Information---");
        System.out.println("Vehicle Number: "+vechileNumber);
        System.out.println("Fuel Capacity: "+fuelCapacity);
        if(fuelType.equals("1"))
        System.out.println("Fuel Type: "+"Petrol");
        else System.out.println("Fuel Type: "+"Diesel");
        System.out.println("CC: "+cc);
    }
    public void displayDetailInfo(){

    }
    
}
