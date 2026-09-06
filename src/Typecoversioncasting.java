import java.util.Scanner;

public class Typecoversioncasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        type conversion
//        float num = input.nextFloat();
//        System.out.println(num);
          // type casting
//        int num = (int)(55.43f);
//        System.out.println(num);

        // automatic type promotion in expression

        // byte maximum limit is 256 if we give it more than
//        // that it will print the remainder of itm like a%256


//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);


//        byte b = 50;
//        b =  (byte)(b * 2);
//        System.out.println(b);

//        int number = 'A';
//        System.out.println(number);
//        System.out.println("こんにちは");
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + ( i / c) - (d-s);
        System.out.println((f * b) + " " + (i / c) + " "  + (d-s));
        System.out.println(result);
//        here every type is converted into double because it was biggest
    }
}
