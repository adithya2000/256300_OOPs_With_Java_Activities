package Question_2;

public class DeluxeAcRoom extends DeluxeRoom {
        public DeluxeAcRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
            super(hotelName, numberOfSqFeet, hasTV, hasWifi);
            ratePerSqFeet=12;

        }
    
}
