import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String fruit = in.next();
        switch (fruit) {
            case "mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "orange" -> System.out.println("a round fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter a valid fruit");
        }

    }
}
