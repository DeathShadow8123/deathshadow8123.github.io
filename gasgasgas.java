import java.util.*;
class gasClass {
    public static void main(String[] args) {

        int y=10;
        int m=21;
        int b=15;

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.next();

        if(choice.equals(10)) {
            System.out.println("shesh");
        } else if(choice.equals(m)) {
            System.out.println("shesh");
        } else if(choice.equals(b)) {
            System.out.println(" ");
        } else if(choice.equalsIgnoreCase("q")) {
            System.out.println("the game will end now!");
            System.exit(0);
        }

        }
    }