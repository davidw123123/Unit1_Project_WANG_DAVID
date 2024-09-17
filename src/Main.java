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

        // Calculations for the tip
        tipPercentage /= 100;
        tipAmount = tipPercentage * billAmount;
        String results = String.format("%.2f", tipAmount);
        double tipAmounts = Double.parseDouble();
        System.out.println("Total Tip Amount:" + results );
       // Total bill cost
       // billAmount += results;
        System.out.println(billAmount);



        }
    }