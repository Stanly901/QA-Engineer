import java.util.Scanner;
public class AstonTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку a");
        String a = scanner.nextLine();
        System.out.println("Введите строку b");
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки индентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}



//Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
//В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
