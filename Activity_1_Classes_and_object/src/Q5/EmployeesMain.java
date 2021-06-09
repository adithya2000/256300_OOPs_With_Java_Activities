package Q5;
import java.util.*;

import Q1.Employee;
public class EmployeesMain {
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
        String Mobile=sc.next();
        e.setMobile(Mobile);
        boolean f=true;
        while(f) {
                System.out.println("Employee Details");
                System.out.println("Name: "+e.getName());
                System.out.println("Address: "+e.getAddress());
                System.out.println("Mobile: "+e.getMobile());
                System.out.println("Verify and Update the details:");
                System.out.println("Menu");
                System.out.println("1. Update Employee name");
                System.out.println("2. Update Employee Address");
                System.out.println("3. Update Employee Mobile");
                System.out.println("4. All information is correct/Exit");
                System.out.println();
                int op=sc.nextInt();
                System.out.println();
        
                switch(op){
                case 1:
                        System.out.println("Current name is: "+e.getName());
                        System.out.println("Enter the Name: ");
                        String na=sc.nextLine();
                        e.setName(na);
                        System.out.println("Anything more to update? (Y/N):");
                        String c=sc.next();
                        if(c.equals("N")||c.equals("n")){
                                f=false;
                                break; 
                        } 
                        break;
                        
                case 2:
                        System.out.println("Current Address is: "+e.getAddress());
                        System.out.println("Enter the Address: ");
                        String Ad=sc.nextLine();
                        e.setAddress(Ad);
                        System.out.println("Wanted more update(Y/N):");
                        String cm=sc.next();
                        if(cm.equals("N")||cm.equals("n")){
                                f=false;
                                break;
                        }
                        break;
                        
                case 3:
                        System.out.println("Current Mobile Number is: "+e.getMobile());
                        System.out.println("Enter the Mobile Number: ");
                        String Mo=sc.nextLine();
                        e.setMobile(Mo);
                        System.out.println("Wanted more update(Y/N):");
                        String cn=sc.next();
                        if(cn.equals("N")||cn.equals("n")){
                                f=false;
                                break; 
                        }
                        break;
                        
                case 4:
                        System.out.println("The Details are:");
                        System.out.println("Name: "+e.getName());
                        System.out.println("Address: "+e.getAddress());
                        System.out.println("Mobile: "+e.getMobile());
                        System.out.println("Wanted more update(Y/N):");
                        String CN=sc.next();
                        if(CN.equals("N")||CN.equals("n")){
                                f=false;
                                break; 
                        }

                        break;     
                }
        }
        sc.close();
        }
        catch(Exception ex){
            System.out.println("Invalid Input");
        }

    }
}
