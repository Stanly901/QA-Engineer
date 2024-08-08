public class AstonTask3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа в массиве");
        for (int number : numbers) {
            if (number % 2 ==0) {
                System.out.println(number);
            }
        }
    }
}

//Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
// необходимо написать программу на java\, которая выведет в консоль все чётные числа.
