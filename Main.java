import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static float round(float x, int y) {
        float scale = (float) Math.pow(10, y);
        return Math.round(x * scale) / scale;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice, option, x;
        float temp, distance, weight, currency;
        String answer;
        boolean yn;
        System.out.print("[Conversion Central]");
        do {
            System.out.println("\nWhich conversion would you like to make?");
            System.out.println(" 1) Temperature\n 2) Distance\n 3) Weight\n 4) Currency\n 5) Quit");
            System.out.print("Option: ");
            choice = scan.nextInt();
            while (choice < 1 || choice > 5) {
                System.out.println("\nInvalid input. Please enter a value between 1 and 5.");
                System.out.println(" 1) Temperature\n 2) Distance\n 3) Weight\n 4) Currency\n 5) Quit");
                System.out.print("Option: ");
                choice = scan.nextInt();
            }
            if (choice == 1) { //Temperature
                do {
                    TempConversion t1 = new TempConversion();
                    System.out.println("\nWhich of the following temperature conversions would you like to make?");
                    System.out.println(" 1) Fahrenheit to Celsius\n 2) Celsius to Fahrenheit\n 3) Celsius to Kelvin\n 4) Kelvin to Celsius");
                    System.out.println(" *NOTE: To make conversions between Fahrenheit and Kelvin, convert to Celsius first.*");
                    System.out.print("Option: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1: //F to C
                            System.out.print("\nTemperature in Fahrenheit: ");
                            temp = scan.nextFloat();
                            t1.setFahrenheit(temp);
                            t1.fToC(temp);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(t1.getFahrenheit() + " degree(s) Fahrenheit is equal to " + round(t1.getCelsius(), x) + " degree(s) Celsius.");
                            break;
                        case 2: //C to F
                            System.out.print("\nTemperature in Celsius: ");
                            temp = scan.nextFloat();
                            t1.setCelsius(temp);
                            t1.cToF(temp);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(t1.getCelsius() + " degree(s) Celsius is equal to " + round(t1.getFahrenheit(), x) + " degree(s) Fahrenheit.");
                            break;
                        case 3: //C to K
                            System.out.print("\nTemperature in Celsius: ");
                            temp = scan.nextFloat();
                            t1.setCelsius(temp);
                            t1.cToK(temp);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(t1.getCelsius() + " degree(s) Celsius is equal to " + round(t1.getKelvin(), x) + " Kelvin(s).");
                            break;
                        case 4: //K to C
                            System.out.print("\nTemperature in Kelvin: ");
                            temp = scan.nextFloat();
                            t1.setKelvin(temp);
                            t1.kToC(temp);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(t1.getKelvin() + " Kelvin(s) is equal to " + round(t1.getCelsius(), x) + " degree(s) Celsius.");
                            break;
                        default:
                            System.out.println("\nInvalid input. Please enter a number between 1 and 4.");
                            break;
                    }
                    System.out.print("\nWould you like to make another temperature conversion? (Y/N): ");
                    answer = scan.next();
                    yn = (answer.equalsIgnoreCase("Y"));
                } while (yn);
            } else if (choice == 2) { //Distance
                do {
                    DistanceConversion d1 = new DistanceConversion();
                    System.out.println("\nWhich of the following distance conversions would you like to make?");
                    System.out.println(" 1) Inches to centimeters\n 2) Centimeters to inches\n 3) Miles to kilometers\n 4) Kilometers to miles");
                    System.out.print("Option: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1: //in to cm
                            System.out.print("\nDistance in inches: ");
                            distance = scan.nextFloat();
                            d1.setInch(distance);
                            d1.iToC(distance);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(d1.getInch() + " inch(es) is equal to " + round(d1.getCentimeter(), x) + " centimeter(s).");
                            break;
                        case 2: //cm to in
                            System.out.print("\nDistance in centimeters: ");
                            distance = scan.nextFloat();
                            d1.setCentimeter(distance);
                            d1.cToI(distance);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(d1.getCentimeter() + " centimeter(s) is equal to " + round(d1.getInch(), x) + " inch(es).");
                            break;
                        case 3: //mi to km
                            System.out.print("\nDistance in miles: ");
                            distance = scan.nextFloat();
                            d1.setMile(distance);
                            d1.mToK(distance);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(d1.getMile() + " mile(s) is equal to " + round(d1.getKilometer(), x) + " kilometer(s).");
                            break;
                        case 4: //km to mi
                            System.out.print("\nDistance in kilometers: ");
                            distance = scan.nextFloat();
                            d1.setKilometer(distance);
                            d1.kToM(distance);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(d1.getKilometer() + " kilometer(s) is equal to " + round(d1.getMile(), x) + " mile(s).");
                            break;
                        default:
                            System.out.println("\nInvalid input. Please enter a number between 1 and 4.");
                            break;
                    }
                    System.out.print("\nWould you like to make another distance conversion? (Y/N): ");
                    answer = scan.next();
                    yn = (answer.equalsIgnoreCase("Y"));
                } while (yn);
            } else if (choice == 3) { //Weight
                do {
                    WeightConversion w1 = new WeightConversion();
                    System.out.println("\nWhich of the following weight conversions would you like to make?");
                    System.out.println(" 1) Pounds to kilograms\n 2) Kilograms to pounds\n 3) Ounces to grams\n 4) Grams to ounces");
                    System.out.print("Option: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1: //lb to kg
                            System.out.print("\nWeight in pounds: ");
                            weight = scan.nextFloat();
                            w1.setPound(weight);
                            w1.pToK(weight);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(w1.getPound() + " pound(s) is equal to " + round(w1.getKilogram(), x) + " kilogram(s).");
                            break;
                        case 2: //kg to lb
                            System.out.print("\nWeight in kilograms: ");
                            weight = scan.nextFloat();
                            w1.setKilogram(weight);
                            w1.kToP(weight);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(w1.getKilogram() + " kilogram(s) is equal to " + round(w1.getPound(), x) + " pound(s).");
                            break;
                        case 3: //oz to g
                            System.out.print("\nWeight in ounces: ");
                            weight = scan.nextFloat();
                            w1.setOunce(weight);
                            w1.oToG(weight);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(w1.getOunce() + " ounce(s) is equal to " + round(w1.getGram(), x) + " gram(s).");
                            break;
                        case 4: //g to oz
                            System.out.print("\nWeight in grams: ");
                            weight = scan.nextFloat();
                            w1.setGram(weight);
                            w1.gToO(weight);
                            System.out.print("Round result to how many decimal places? ");
                            x = scan.nextInt();
                            System.out.println(w1.getGram() + " gram(s) is equal to " + round(w1.getOunce(), x) + " ounce(s).");
                            break;
                        default:
                            System.out.println("\nInvalid input. Please enter a number between 1 and 4.");
                            break;
                    }
                    System.out.print("\nWould you like to make another weight conversion? (Y/N): ");
                    answer = scan.next();
                    yn = (answer.equalsIgnoreCase("Y"));
                } while (yn);

            } else if (choice == 4) { //Currency
                do {
                    DecimalFormat formatter = new DecimalFormat("0.00");
                    CurrencyConversion c1 = new CurrencyConversion();
                    System.out.println("\nWhich of the following currency conversions would you like to make?");
                    System.out.println(" 1) US dollars to euros\n 2) Euros to US dollars\n 3) US dollars to Indian rupees\n 4) Indian rupees to US dollars");
                    System.out.println(" *NOTE: To make conversions between Euros and the Rupees, convert to US Dollars first.*");
                    System.out.print("Option: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1: //$ to €
                            System.out.print("\nCurrency in dollars: ");
                            currency = scan.nextFloat();
                            c1.setDollar(currency);
                            c1.dToE(currency);
                            System.out.println(formatter.format(c1.getDollar()) + " dollar(s) is equal to " + formatter.format(c1.getEuro()) + " euro(s).");
                            break;
                        case 2: //€ to $
                            System.out.print("\nCurrency in euros: ");
                            currency = scan.nextFloat();
                            c1.setEuro(currency);
                            c1.eToD(currency);
                            System.out.println(formatter.format(c1.getEuro()) + " euro(s) is equal to " + formatter.format(c1.getDollar()) + " dollar(s).");
                            break;
                        case 3: //$ to ₹
                            System.out.print("\nCurrency in dollars: ");
                            currency = scan.nextFloat();
                            c1.setDollar(currency);
                            c1.dToR(currency);
                            System.out.println(formatter.format(c1.getDollar()) + " dollar(s) is equal to " + formatter.format(c1.getRupee()) + " rupee(s).");
                            break;
                        case 4: //₹ to $
                            System.out.print("\nCurrency in rupees: ");
                            currency = scan.nextFloat();
                            c1.setRupee(currency);
                            c1.rToD(currency);
                            System.out.println(formatter.format(c1.getRupee()) + " rupee(s) is equal to " + formatter.format(c1.getDollar()) + " dollar(s).");
                            break;
                        default:
                            System.out.println("\nInvalid input. Please enter a number between 1 and 4.");
                            break;
                    }
                    System.out.print("\nWould you like to make another weight conversion? (Y/N): ");
                    answer = scan.next();
                    yn = (answer.equalsIgnoreCase("Y"));
                } while (yn);
            } else {
                System.out.println("\nThank you for using Conversion Central. Come back soon!\n\n[Terminating program]");
            }
        } while (choice != 5);
    }
}