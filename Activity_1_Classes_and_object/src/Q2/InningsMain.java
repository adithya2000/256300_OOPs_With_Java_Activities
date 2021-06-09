package Q2;
import java.util.*;
public class InningsMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Innings i=new Innings(); 
        System.out.println("Enter the team name:");
        String tname=sc.next();
        i.setTeamName(tname);
        System.out.println("Enter session:");
        String s=sc.next(); //Enter only First and Second
        i.setinningsname(s);
        System.out.println("Enter runs:");
        int runs=sc.nextInt();
        i.setruns(runs);
        i.displayInningsDetails();
    }
    
}
