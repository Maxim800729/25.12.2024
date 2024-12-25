//8. Парсинг массива
//Создайте массив строк. Попробуйте преобразовать каждую строку в целое число.
//Если преобразование невозможно, выбросьте исключение и выведите сообщение о некорректном значении.


public class Main7 {
    public static void main(String[] args) {
        // Создаём массив строк
        String[] strArray = {"42", "17", "abc", "100", "5xyz"};

        // Пытаемся преобразовать каждую строку в целое число
        for (int i = 0; i < strArray.length; i++) {
            try {
                int number = Integer.parseInt(strArray[i]);
                System.out.println("Элемент массива: " + strArray[i] + " преобразован в число: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: элемент массива '" + strArray[i] + "' невозможно преобразовать в целое число.");
            }
        }
    }
}
