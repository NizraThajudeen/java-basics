import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[]=new int[3];

        while (true) {
            System.out.println("Enter the first number");
            try {
               arr[0] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("invalid number");
                sc.nextLine();
            }
        }
        while (true) {
            System.out.println("Enter the second number");
            try {
                arr[1] = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("invalid number");
                sc.nextLine();
            }
        }

        operator_loop:while (true){
            try{
                System.out.println("Enter the operator (+,-,*,/)");
                char operator = sc.next().charAt(0);

                switch (operator) {

                    case '+':
                        arr[2] = arr[0] + arr[1];
                        break operator_loop;

                    case '-':
                        arr[2] = arr[0] - arr[1];
                        break operator_loop;

                    case '*':
                        arr[2] = arr[0] * arr[1];
                        break operator_loop;

                    case '/':
                        try{
                            arr[2] = arr[0] / arr[1];
                            break operator_loop;
                        } catch(ArithmeticException ex){
                            System.out.println("Cannot divide by 0");
                            break;
                        }

                    default:
                        throw new CustomException("Invalid Operator");
                }
            } catch (CustomException ex){
                System.out.println(ex.getMessage());
            }

        }

        System.out.println("The result is "+arr[2]);

    }
}
