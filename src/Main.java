import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Temperature: ");
        double temperature = scan.nextDouble();
        scan.nextLine();
        System.out.println("Scale(C/K/F): ");
        String unit = scan.nextLine();
        System.out.println("New Scale(C/K/F): ");
        String newUnit = scan.nextLine();

        Converter converter = new Converter(temperature);
        String scale = (unit + newUnit).toUpperCase();
        switch (scale) {
            case "CK" -> converter.CelsiusToKelvin(temperature);
            case "CF" -> converter.CelsiusToFahrenheit(temperature);
            case "KC" -> converter.KelvinToCelsius(temperature);
            case "KF" -> converter.KelvinToFahrenheit(temperature);
            case "FC" -> converter.FahrenheitToCelsius(temperature);
            case "FK" -> converter.FahrenheitToKelvin(temperature);
            default -> System.out.println("Impossible to convert");
        }

        System.out.println(converter);

    }
}