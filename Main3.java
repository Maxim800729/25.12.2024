//
//4. Нахождение минимального числа
//Запросите у пользователя несколько чисел (например,5).
//Если одно из введённых значений не является числом,
// выбросьте исключение и выведите сообщение об ошибке.


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Запрос количества чисел
            System.out.print("Сколько чисел вы хотите ввести? ");
            int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("Количество чисел должно быть больше 0.");
                return;
            }

            // Запрос ввода чисел
            System.out.println("Введите " + count + " чисел:");
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < count; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
            }

            // Вывод минимального числа
            System.out.println("Минимальное число: " + min);

        } catch (java.util.InputMismatchException e) {
            // Обработка некорректного ввода
            System.out.println("Ошибка: одно из введённых значений не является числом.");
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
