import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean k = true;
        int count = 0;
        int i;
        if (number < 2) {
            k = false;
        } else if (number == 2) {
            k = true;
        } else {
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    k = false;
                    break;
                }
            }
        }
        if (k) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
    }
}
