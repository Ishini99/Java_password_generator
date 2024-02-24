import java.util.Scanner;
public class Main {
    public static final Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {

        Generator generator =new Generator(keyboard); //creates a new instance of the Generator class and assigns it to the variable generator. It uses the new keyword to instantiate the object and passes a keyboard object as an argument to its constructor.
        generator.mainLoop();// calls the mainLoop() method on the generator object. Presumably, this method contains the main functionality or loop of the Generator class.
        keyboard.close();//suggests that the program is done with keyboard input and is releasing the associated system resources. This is good practice to avoid memory leaks and ensure proper resource management.
    }
}