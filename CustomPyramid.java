import java.util.Scanner;
public class CustomPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int h = scanner.nextInt();
        
        for (int i = 1; i <= h; i++) {
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
