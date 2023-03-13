
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (Object element : elements) { // проходим по каждому элементу списка
            if (element instanceof String) { // проверяем, является ли элемент строкой
                printString(); // если да, то вызываем метод для работы со строками
            } else if (element instanceof Integer) { // проверяем, является ли элемент целым числом
                printInteger(); // если да, то вызываем метод для работы с целыми числами
            } else if (element instanceof Integer[]) { // проверяем, является ли элемент массивом целых чисел
                printIntegerArray(); // если да, то вызываем метод для работы с массивами целых чисел
            } else { // если элемент не является строкой, целым числом или массивом целых чисел
                printUnknown(); // вызываем метод для работы с неизвестными типами данных
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}