//6. Поиск подстроки
//Запросите у пользователя строку и символ.
// Если строка не содержит указанный символ,
// выбросьте исключение и выведите сообщение об ошибке.


import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Запрос строки у пользователя
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();

            // Запрос символа у пользователя
            System.out.print("Введите символ для поиска: ");
            char searchChar = scanner.next().charAt(0);

            // Проверка наличия символа в строке
            if (!inputString.contains(String.valueOf(searchChar))) {
                throw new Exception("Ошибка: символ '" + searchChar + "' не найден в строке.");
            }

            // Если символ найден
            System.out.println("Символ '" + searchChar + "' найден в строке!");

        } catch (Exception e) {
            // Обработка исключения
            System.out.println(e.getMessage());
        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}
