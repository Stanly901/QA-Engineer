import java.util.Scanner;

public class AstonTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число a");
        int a = scanner.nextInt();
        System.out.println("Ведите число b");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else
            System.out.println("a=b");
        int sum = a + b;
        int dif = a - b;
        int prod = a * b;
        double div = b != 0 ? (double) a / b : Double.NaN;
        System.out.println("Сумма a + b =" + sum);
        System.out.println("Разность a - b =" + dif);
        System.out.println("Произведение a * b =" + prod);
        if (b != 0) {
            System.out.println("Частное a/b=" + div);
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }
}

//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.