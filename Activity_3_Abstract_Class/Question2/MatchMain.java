package Question2;
import java.util.Scanner;

public class MatchMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the match format");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        int op=sc.nextInt();
        Match match;
        if(op==1){
            ODIMatch o=new ODIMatch();
            match=o;
            System.out.println("Enter the Current Score: ");
            int curr=sc.nextInt();
            System.out.println("Enter the Current Over: ");
            float over=sc.nextFloat();
            System.out.println("Enter the Target Score: ");
            int score=sc.nextInt();
            match.setValue(curr, over, score);
            float rrr=match.calculateRunRate();
            int ball=match.calculateBalls();
            match.display(rrr, ball);

            
        }
        else if(op==2){
            T20Match t=new T20Match();
            match=t;
            System.out.println("Enter the Current Score: ");
            int curr=sc.nextInt();
            System.out.println("Enter the Current Over: ");
            float over=sc.nextFloat();
            System.out.println("Enter the Target Score: ");
            int score=sc.nextInt();
            match.setValue(curr, over, score);
            float rrr=match.calculateRunRate();
            int ball=match.calculateBalls();
            match.display(rrr, ball);

        }
        else if(op==3){
            TestMatch o=new TestMatch();
            match=o;
            System.out.println("Enter the Current Score: ");
            int curr=sc.nextInt();
            System.out.println("Enter the Current Over: ");
            float over=sc.nextFloat();
            System.out.println("Enter the Target Score: ");
            int score=sc.nextInt();
            match.setValue(curr, over, score);
            float rrr=match.calculateRunRate();
            int ball=match.calculateBalls();
            match.display(rrr, ball);

        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
        
    }
    
}
