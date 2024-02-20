import java.util.Scanner;
public class w2t3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value of miles: ");
        int miles = scan.nextInt();

        double km = miles * 1.60935;

        System.out.print("Conversion to km: " + km);

    }
}
