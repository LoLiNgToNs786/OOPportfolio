import java.util.Scanner;
public class w2t4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of square side: ");
        int length = scan.nextInt();

        int area, perimeter;
        area = length * length;
        perimeter = length * 4;

        System.out.print("Perimeter: " + perimeter + "\nArea: " + area);

    }
}
