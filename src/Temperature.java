import java.util.Scanner;

public class Temperature {
    private static String system;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The Temperature In Celsius");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5)+ 32;
        System.out.println(tempF);



    }
}
