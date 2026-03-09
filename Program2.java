import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("The Year " + year + " is a Leap Year");
        } else {
            System.out.println("The Year " + year + " is not a Leap Year");
        }

        sc.close();
    }
}