package Q1;
import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        Employee e=new Employee();
        try{
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        e.setName(name);
        System.out.println("Enter Address:");
        String address=sc.nextLine();
        e.setAddress(address);
        System.out.println("Enter Mobile");
        String mobile=sc.next();
        e.setMobile(mobile);
        
        System.out.println("Employee Details");
        System.out.println("Name: "+e.getName());
        System.out.println("Address: "+e.getAddress());
        System.out.println("Mobile: "+e.getMobile());
        }
        catch(Exception ex){
            System.out.println("Invalid Input");
        }

    }
}
