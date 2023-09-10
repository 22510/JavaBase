package simpleFactory;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while (true) {
        try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number1:");
                double num1 = scanner.nextDouble();
                System.out.print("Enter sign:");
                char sign = scanner.next().charAt(0);
                System.out.print("Enter number2:");
                double num2 = scanner.nextDouble();

                double result = 0;
//        if (sign == '+') {
//            result = num1 + num2;
//        }else if (sign == '-') {
//            result = num1 - num2;
//        }else if (sign == '*') {
//            result = num1 * num2;
//        }else if (sign == '/') {
//            result = num1 / num2;
//        }
                switch (sign) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
//                        throw new RuntimeException("除数不能为0");
                            System.out.println("Warning");
                        }
                        break;
                }
                System.out.println("result: " + result);
            } catch(Exception e){
                e.printStackTrace();
                System.out.println("有错误");
            }
        }
    }
}
