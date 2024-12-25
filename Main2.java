
//    3. Обращение к элементу массива
//    Создайте массив из 5 элементов. Запросите у пользователя индекс и
//    выведите элемент массива по этому индексу.
//    Обработайте ситуацию, когда индекс выходит за границы массива.

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input arrays
        int[] arr = {-2, -1, 0, 4, 7,};
        try {
            // Запрос ввода числа
            System.out.print("Введите индекс: ");
            int index = scanner.nextInt();
            int value = arr[index];
            System.out.println("элемент массива по этому индексу " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индекс выходит за границы массива ");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: введённое значение не является числом.");
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
