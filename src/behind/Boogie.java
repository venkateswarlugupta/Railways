package behind;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boogie extends Wagonn {
//public class Boogie implements Wagon {
    int boogieNo;
    String tire;
    int rows;
    int columns;
    byte seatNo = 1;
    byte availableSeats;
    List<List<Seat>> seats=new ArrayList<List<Seat>>();
    Boogie(int boogieNo, String tire, int rows, int columns) {
        this.boogieNo = boogieNo;
        this.tire = tire;
        this.rows = rows;
        this.columns = columns;
        availableSeats = (byte) (rows * columns);
        for (byte column, row = 0; row < rows; row++) {
            seats.add(new ArrayList<>());
            for (column = 0; column < columns; column++) {
                seats.get(row).add(new Seat(seatNo++, getPosition()));
            }
        }
    }

    boolean bookSeats(int noOfSeats) {
        try {
            while (noOfSeats-- > 0) {
                seats.get((rows * columns - availableSeats) % rows).get((columns - noOfSeats) / 2).bookNow();
                System.out.println("Seat No : " + (rows * columns - availableSeats + 1));
                //max no of seats allowed to book is size of 2*columns
                availableSeats--;
            }
            System.out.println(isBooked(1-1)+" "+getSeatNo(1-1));
            System.out.println(isBooked(2-1)+" "+getSeatNo(2-1));
            System.out.println(isBooked(3-1)+" "+getSeatNo(3-1));
            System.out.println(isBooked(19-1)+" "+getSeatNo(19-1));
            //throw new BoogieRemovedDueToMaintenance();
            System.out.println("Successfully booked");
            return true;
        } catch (Exception e) {
            System.out.println("Unsuccessful to book due to " + e.toString());
            return false;
        }
    }

    boolean isBooked(int SeatNo){
        return seats.get(seatNo%rows).get((seatNo%rows)%columns).isBooked;
    }

    int getSeatNo(int SeatNo){
        return seats.get(seatNo%rows).get((seatNo%rows)%columns).seatNo;
    }

    boolean cancelSeats(int noOfSeats, ArrayList<Byte> seatNumbers) {
        try {
            while (noOfSeats-- > 0) {
                int seatNumber = seatNumbers.get(noOfSeats);
                seats.get(seatNumber % rows).get(columns - seatNumber % rows).cancelNow();
            }
            System.out.println("Successfully cancelled");
            return true;
        } catch (Exception e) {
            System.out.println("Unsuccessful while cancelling ");
            return false;
        }
    }

    StringTokenizer getPosition() {
        if (tire.equals("1A")) {
            if (seatNo % 2 == 0) {
                return new StringTokenizer("Aisle::Upper", ":");
            } else {
                return new StringTokenizer("Window::Lower", ":");
            }
        } else if (tire.equals("2A")) {
            if (seatNo % 3 == 0 || seatNo % 3 == 1) {
                return new StringTokenizer("Window::Lower", ":");
            } else {
                return new StringTokenizer("Aisle::Upper", ":");
            }
        } else {
            if (seatNo % 4 == 0 || (seatNo - 1) % 4 == 0) {
                return new StringTokenizer("Window::Lower", ":");
            } else if (seatNo % 2 == 0) {
                return new StringTokenizer("Aisle::Upper", ":");
            } else {
                return new StringTokenizer("Middle::Middle", ":");
            }
        }
    }
}


class FirstClass extends Boogie {

    FirstClass(int boogieNo) {
        super(boogieNo, "1A", 10, 2);
    }
}

class SecondClass extends Boogie {

    SecondClass(int boogieNo) {
        super(boogieNo, "2A", 12, 3);
    }
}

class ThirdClass extends Boogie {

    ThirdClass(int boogieNo) {
        super(boogieNo, "3A", 12, 4);
    }
}

class Sleeper extends Boogie {

    Sleeper(int boogieNo) {
        super(boogieNo, "SL", 18, 4);
    }
}