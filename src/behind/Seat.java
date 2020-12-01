package behind;

import java.util.StringTokenizer;

public class Seat {
    byte seatNo;
    String seatPosition;
    String bearthPosition;
    boolean isBooked;
    Seat(byte seatNo, StringTokenizer position){
        this.seatNo=seatNo;
        this.seatPosition=position.nextToken();
        this.bearthPosition=position.nextToken();
        isBooked=false;
    }
    boolean bookNow(){
        isBooked=true;
        return true;
    }
    boolean cancelNow(){
        isBooked=false;
        return true;
    }
    boolean isWindow(){
        return !seatPosition.equals("Window");
    }
}