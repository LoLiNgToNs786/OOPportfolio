import java.util.Scanner;
public class w2t2 {
    public static void main(String[] args) {
        int val1, val2, val3;
        int average;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter three integers and " +
                "I will compute their average" +
                "\nEnter 1st value: ");
        val1 = scan.nextInt();

        System.out.print("Enter 2nd value: ");
        val2 = scan.nextInt();

        System.out.print("Enter 3rd value: ");
        val3 = scan.nextInt();

        average = (val1 + val2 + val3) / 3;
        System.out.println("\nAverage: " + average);

    }

}
