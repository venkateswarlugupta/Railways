package behind.exceptions;

public class GroceriesShortage extends Throwable {
    @Override
    public String toString() {
        return "Need more groceries. Supply more!";
    }
}
