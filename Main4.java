//5. Чтение строки с ограничением длины
//Запросите у пользователя ввод строки.
//Если длина строки превышает 10 символов,
// выбросьте исключение с сообщением, что строка слишком длинная.
//


import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ввeдите строку ");
            String input = scanner.nextLine();
            if (input.length() > 10) {
                throw new Exception("строка слишком длинная");
            }
            System.out.println("ввeденная строка " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
