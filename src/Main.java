import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        // Variables needed
        System.out.print("Total bill amount ($): ");
        String x = s.nextLine();
        double billAmount = Double.parseDouble(x);
        System.out.print("Tip percent in whole number: ");
        String y = s.nextLine();
        double tipPercentage = Double.parseDouble(y);
        System.out.print("Amount of people: ");
        String z = s.nextLine();
        int peopleAmount = Integer.parseInt(z);
        double tipAmount;
        double tipPerson;
        System.out.println("---------------------------");

        // Calculations for the tip
        tipPercentage /= 100;
        tipAmount = tipPercentage * billAmount;
        String results = String.format("%.2f", tipAmount); // Rounds to the hundredths
        System.out.println("Total Tip Amount: $" + results);
        System.out.println("---------------------------");
        double tipAmounts = Double.parseDouble(results); // Converts String to double

        // Total bill cost
        billAmount += tipAmounts;
        String result2 = String.format("%.2f", billAmount);  // Rounds to the hundredths
        System.out.println("Total Bill Cost: $" + result2);
        System.out.println("---------------------------");
        double billAmounts = Double.parseDouble(result2);  // Converts String to double

        //Tip per person
        tipPerson = tipAmounts/peopleAmount;
        String result3 = String.format("%.2f", tipPerson);  // Rounds to the hundredths
        System.out.println("Tip per person: $" + result3);
        System.out.println("---------------------------");

        // Total Bill per person
        billAmounts /= peopleAmount;
        String result4 = String.format("%.2f", billAmounts); // Rounds to the hundredths
        System.out.println("Total bill per person: $" + result4);
        System.out.println("---------------------------");

        }
    }