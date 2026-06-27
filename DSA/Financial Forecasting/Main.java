import java.util.Scanner;

public class Main {

    // Recursive function
    static double forecast(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + rate / 100), rate, years - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Growth Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = forecast(amount, rate, years);

        System.out.printf("Forecasted Amount = %.2f", result);

        sc.close();
    }
}
