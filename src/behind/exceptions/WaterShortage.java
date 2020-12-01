package behind.exceptions;

public class WaterShortage extends Exception{
    @Override
    public String toString() {
        return "We are planning to increase the capacity of the water container";
    }
}
