//7. Число в диапазоне
//Попросите пользователя ввести число.
// Если введённое число меньше 1 или больше 100,
// выбросьте исключение с сообщением о некорректном диапазоне.

import java.util.Scanner;
public class Main6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Запрос числа у пользователя
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            // Проверка диапазона
            if (number < 1 || number > 100) {
                throw new Exception("Ошибка: введённое число не входит в диапазон от 1 до 100.");
            }

            // Если число в диапазоне
            System.out.println("Число " + number + " находится в допустимом диапазоне.");

        } catch (java.util.InputMismatchException e) {
            // Обработка некорректного ввода
            System.out.println("Ошибка: введённое значение не является числом.");
        } catch (Exception e) {
            // Обработка исключения о диапазоне
            System.out.println(e.getMessage());
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
