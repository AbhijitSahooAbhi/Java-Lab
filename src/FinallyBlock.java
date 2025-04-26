package src;
import java.io.IOException;

public class FinallyBlock {

    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void methodThatThrowsException() throws IOException {
        System.out.println("Inside methodThatThrowsException.");
        throw new IOException("This is a simulated IOException.");
    }
}
