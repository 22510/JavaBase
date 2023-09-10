package simpleFactory;

import java.util.Scanner;

public class testFactory {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1:");
        double num1 = scanner.nextDouble();
        System.out.print("Enter sign:");
        char sign = scanner.next().charAt(0);
        System.out.print("Enter number2:");
        double num2 = scanner.nextDouble();

        Operation test = SimpleFactoryMode.createOperation(sign);
        test.setNumberA(num1);
        test.setNumberB(num2);

        System.out.println("Result:" + test.getResult());

    }
}
