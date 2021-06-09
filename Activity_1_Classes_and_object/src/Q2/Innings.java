package Q2;
import java.util.Scanner;

public class Innings {
    private String teamname,inningsname;
    private int runs;

    public void setTeamName(String name){
        teamname=name;
    }
    public String getTeamName(){
        return teamname;
    }

    public void setinningsname(String name){
        inningsname=name;
    }
    public String getinningsname(){
        return inningsname;
    }
    
    public void setruns(int runs){
        this.runs=runs;
    }
    public int getruns(){
        return runs;
    }
    public void displayInningsDetails(){
        System.out.println("Name: "+teamname);
        System.out.println("Scored: "+runs);
        if(inningsname.equals("First")){
            runs++;
            System.out.println("Need "+runs+" to win");
        }
        else{
            System.out.println("Match ended.");
        }

    }
   
}
