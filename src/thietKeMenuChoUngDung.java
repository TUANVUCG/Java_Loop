import java.util.Scanner;

public class thietKeMenuChoUngDung {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You draw the triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }break;
                case 2:
                    System.out.println("You draw the square");
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("* * * * * *");
                    }
                    break;
                case 3:
                    System.out.println("You draw the rectangle");
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("* * * * * * * * * * * *");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye !!!");
            }
        } while (choice > 0 && choice < 5);
    }
}
