import java.util.Scanner;
public class w2t5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Numerator: ");
        int numerator = scan.nextInt();

        System.out.print("Denominator: ");
        int denominator = scan.nextInt();

        float decimal = (float) numerator / denominator;
        System.out.print("Decimal equivalent: " + decimal);

    }
}
