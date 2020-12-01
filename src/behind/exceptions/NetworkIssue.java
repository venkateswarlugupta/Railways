package behind.exceptions;

public class NetworkIssue extends Throwable{
    @Override
    public String toString() {
        return "Bad Network...\nTry again:(";
    }
}
