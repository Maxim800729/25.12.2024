//9. Проверка делимости
//Попросите пользователя ввести два числа.
// Если второе число не является делителем первого, выбросьте исключение с сообщением:
// "Число не делится без остатка".

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ввод первого числа
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            // Ввод второго числа
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            // Проверка делимости
            if (num2 == 0) {
                throw new ArithmeticException("Ошибка: деление на ноль невозможно.");
            }
            if (num1 % num2 != 0) {
                throw new Exception("Число не делится без остатка.");
            }

            // Если делится без остатка
            System.out.println("Число " + num1 + " делится на " + num2 + " без остатка.");

        } catch (ArithmeticException e) {
            // Обработка ошибки деления на ноль
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Обработка других исключений
            System.out.println(e.getMessage());
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
