import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

/**
 * [4*] К калькулятору из предыдущего дз добавить логирование.
 */
class Calculator {
    private static File log;
    private static FileWriter fileWriter;
    private static int back;
    /**
     * [3*] Реализовать простой калькулятор
     * @param args аргументы командной строки
     */
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            try {
            Scanner scanner = new Scanner(System.in);
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);


            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите операцию (+ - * / <): ");
            char op = scanner.next().charAt(0);
            if(op == '<'){
                    logStep("Result is: " + back);
                    System.out.println("Backed to " + back);
                    flag = false;
                    break;
            }
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            int res;
            switch (op) {
                case '+':
                    res = add(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " + " + b + " = " + res);

                    break;
                case '-':
                    res = minus(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " - " + b + " = " + res);
                    break;
                case '*':
                    res = multi(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " * " + b + " = " + res);
                    break;
                case '/':
                    res = divide(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " / " + b + " = " + res);
                    break;
                default:
                    logStep("Wrong operation!");
                    System.out.println("Wrong operation!");
                    break;
            }
        }
            finally {
                fileWriter.close();
            }
        }
        
    }

    private static int divide(int a, int b) {
        if (b != 0) return a / b;
        back = a;
        return -1;
    }

    private static int multi(int a, int b) {
        back = a;
        return a * b;
    }

    private static int minus(int a, int b) {
        back = a;
        return a - b;
    }

    private static int add(int a, int b) {
        back = a;
        return a + b;
    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }

}