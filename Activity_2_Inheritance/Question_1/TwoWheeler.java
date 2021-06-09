package Question_1;
public class TwoWheeler extends Vehicle{
    private boolean kickStartAvailable;
    TwoWheeler(String make,String Vnumber,String fType,int cap,int cc,boolean kickStartAvailable){
        super(make,Vnumber,fType,cap,cc);
        this.kickStartAvailable=kickStartAvailable;
    }
    public void displayDetailInfo(){
        System.out.println("---Detail Informaion---");
        if(kickStartAvailable)
        System.out.println("Kick Start AVAILBLE: "+"YES");
        else{
            System.out.println("Kick Start AVAILBLE: "+"NO");
        }
    }
   
}
