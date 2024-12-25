
//10. Индексы и значение
//Создайте массив из 10 элементов. Попросите пользователя ввести индекс и значение для записи в массив.
// Обработайте ситуации, когда индекс выходит за пределы массива или значение некорректно.

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаём массив из 10 элементов
        int[] array = new int[10];

        try {
            // Запрос индекса у пользователя
            System.out.print("Введите индекс массива (от 0 до 9): ");
            int index = scanner.nextInt();

            // Проверка на выход за пределы массива
            if (index < 0 || index >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Ошибка: индекс выходит за пределы массива.");
            }

            // Запрос значения для записи
            System.out.print("Введите значение для записи: ");
            int value = scanner.nextInt();

            // Запись значения в массив
            array[index] = value;
            System.out.println("Значение " + value + " успешно записано в массив по индексу " + index + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Обработка ошибки выхода за пределы массива
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            // Обработка ошибки некорректного ввода
            System.out.println("Ошибка: введено некорректное значение.");
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
