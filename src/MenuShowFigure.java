import java.util.Scanner;

public class MenuShowFigure {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1.Print the rectangle. ");
            System.out.println("2.Print the square triangle. ");
            System.out.println("3.Exit ");
            System.out.print("Enter the choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter width: ");
                int w = input.nextInt();
                System.out.print("Enter height: ");
                int h = input.nextInt();
                rectangle(w, h);
            } else if (choice == 2) {
                System.out.println("1.Draw a triangle at the top");
                System.out.println("2.Draw a triangle at the bot");
                System.out.print("Enter the choice: ");
                int chose = input.nextInt();
                if (chose == 1) {
                    System.out.print("Enter height: ");
                    int h = input.nextInt();
                    square_triangle_top(h);
                }
                if (chose == 2) {
                    System.out.print("Enter height: ");
                    int h = input.nextInt();
                    square_triangle_bot(h);
                } else if (choice == 3) {
                    System.exit(3);
                } else {
                    System.out.println("No choice!");
                }
            }

        }
    }
    public static String rectangle(int w, int h) {
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return null;
    }

    public static String square_triangle_bot(int h) {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return null;
    }

    public static String square_triangle_top(int h) {
        for (int i = h; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return null;
    }
}
