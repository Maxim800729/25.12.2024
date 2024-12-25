import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Запрос ввода числа
            System.out.print("Введите число: ");
            int numerator = scanner.nextInt();

            // Вывод результата
            System.out.println("Число: " + numerator);

        } catch (java.util.InputMismatchException e) {
            // Обработка ошибки некорректного ввода
            System.out.println("Ошибка: введённое значение не является числом.");
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
