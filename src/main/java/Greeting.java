import java.util.Scanner;

/**
 * Created by nazhirjackson on 9/9/16.
 */
public class Greeting {
    public void ask() {
        Scanner hi = new Scanner(System.in);
        System.out.println("Hello what is your name?: ");
        String name = hi.next().toLowerCase();
        String greeting;
        switch (name) {

            case "alice":
                greeting = name;
                System.out.println("Hi " + greeting);
                break;
            case "bob":
                greeting = name;
                System.out.println("Hi " + greeting);
                break;
            default:
                System.out.println("I don't know you Fool Get outta here!");
                break;
        }

    }


    public static void main(String[] args) {
        Greeting meh = new Greeting();
        meh.ask();

    }
}
