package Question_2;

public class HotelRoom {
    protected String hotelName;
    protected int numberOfSqFeet;
    protected boolean hasTV;
    protected boolean hasWifi;

    public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        this.hotelName=hotelName;
        this.numberOfSqFeet=numberOfSqFeet;
        this.hasTV=hasTV;
        this.hasWifi=hasWifi;
    }
    public int calculateTariff(int rate){
        return rate*numberOfSqFeet;
    }
    public int getRatePerSqFeet(){
        return 0;
    }
    
}
