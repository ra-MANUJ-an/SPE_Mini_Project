package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator, Choose to perform operation");
            System.out.print("Press 1 to for SquareRoot\nPress 2 to for Factorial\nPress 3 to for Log\nPress 4 to find Power of x\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // find square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.squareroot(number1));
                    System.out.println("\n");


                    break;



                case 2:

                    // factorial
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();

                    System.out.println("Factorial of "+number1+"  is : " + calculator.factorial(number1));
                    System.out.println("\n");

                    break;



                case 3:
                    // find lnx
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("log to the base e  of "+number1+" is : " + calculator.lnx(number1));
                    System.out.println("\n");

                    break;



                case 4:
                    // do power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Power of "+number1+" to "+number2+" is : " + calculator.power(number1,number2));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public double squareroot(double number1)
    {
        logger.info("[SquareROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - Square ROOT] - " + result);
        return result;
    }

    public double factorial (double number1) {
        logger.info("[factorial] - " + number1);
        double result = 1;
        for(int i = 1; i <= number1; ++i) {
            result *= i;
        }
        logger.info("[RESULT - Square ROOT] - " + result);
        return  result;
    }


    public double lnx(double number1)
    {
        logger.info("[lnx] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - lnx] - " + result);
        return result;
    }




    public double power(double number1, double number2)
    {
        logger.info("[Result - " + number1 + " to the power " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[power] - " + result);
        return result;
    }






}