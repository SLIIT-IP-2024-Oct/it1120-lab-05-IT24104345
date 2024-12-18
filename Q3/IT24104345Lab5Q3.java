import java.util.Scanner;

public class IT24104345Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE = 48000;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || endDate > 31 || startDate >= endDate) {
            System.out.println("Error: Invalid dates entered.");
            return;
        }

        int daysReserved = endDate - startDate + 1;
        double discount = 0;

        if (daysReserved > 3) {
            discount = (daysReserved >= 5) ? DISCOUNT_5_OR_MORE : DISCOUNT_3_4_DAYS;
        }

        double totalCost = daysReserved * ROOM_CHARGE * (1 - discount / 100);
        System.out.println("Days Reserved: " + daysReserved);
        System.out.println("Total Cost: Rs. " + totalCost);
    }
}