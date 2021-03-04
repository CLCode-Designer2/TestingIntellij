package CurrencyConversion;

import java.util.Scanner;

public class DollarsPounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input currency in SEK:");
        float amount = sc.nextInt();
        float dollar = (amount/8);
        float pound = (amount/11);
        System.out.println("Currency converts to: $" +dollar);
        System.out.println("Currency converts to: €" +pound);

        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature - 32)*5)/9;
        System.out.println("temperature in Celsius = " + temperature);

        System.out.println("Enter temperature in Celsius");
        temperature = in.nextInt();

        temperature = ((temperature - 9/5) + 32);
        System.out.println("temperature in Fahrenheit = " + temperature);

    }
}
