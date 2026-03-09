import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter height of Amar: ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter height of Akbar: ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter height of Anthony: ");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest.");
        } 
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } 
        else {
            System.out.println("Anthony is the youngest.");
        }

        // Find tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest.");
        } 
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } 
        else {
            System.out.println("Anthony is the tallest.");
        }

        sc.close();
    }
}