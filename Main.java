import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Запрос ввода делимого
            System.out.print("Введите делимое: ");
            int numerator = scanner.nextInt();

            // Запрос ввода делителя
            System.out.print("Введите делитель: ");
            int denominator = scanner.nextInt();

            // Выполнение деления
            int result = numerator / denominator;

            // Вывод результата
            System.out.println("Результат деления: " + result);

        } catch (ArithmeticException e) {
            // Обработка ошибки деления на ноль
            System.out.println("Ошибка: деление на ноль невозможно.");
        } catch (Exception e) {
            // Обработка других ошибок ввода
            System.out.println("Ошибка: некорректный ввод.");
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
