package Q3;
import java.util.Scanner;
public class CustomerMain {
    public static void main(String[] args) {
        Customer c=new Customer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        String s=sc.next();
        String str[]=s.split("[,]");
        c.setName(str[0]);
        c.setAddress(str[1]);
        c.setMobile(str[2]);
        System.out.println("Name: "+c.getName());
        System.out.println("Address: "+c.getAddress());
        System.out.println("Mobile: "+c.getMobile());


    }
    
}
