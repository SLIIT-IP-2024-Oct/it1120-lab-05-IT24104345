import java.util.Scanner;

public class IT24104345Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of new members introduced:");
        int members = scanner.nextInt();

        if (members < 0) {
            System.out.println("Invalid input! Number of members must be >= 0.");
        } else {
            String prize;
            switch (members) {
                case 0: prize = "No Prize"; break;
                case 1: prize = "Pen"; break;
                case 2: prize = "Umbrella"; break;
                case 3: prize = "Bag"; break;
                case 4: prize = "Traveling Chair"; break;
                default: prize = "Headphone"; break;
            }
            System.out.println("Prize: " + prize);
        }
    }
}