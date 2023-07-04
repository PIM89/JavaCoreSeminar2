public class Main {
    public static void main(String[] args) {
        int[] array = {2, -6, 2, 3, 10, 0, 0, 0};

        System.out.println("Задание № 1");
        System.out.println("Количество чётных элементов массива: " + Task1.countEvens(array));

        System.out.println("Задание № 2");
        System.out.println("Разница между самым большим и самым маленьким элементами массива: " + Task2.difMaxMin(array));

        System.out.println("Задание № 3");
        if (Task3.HasZeroNeighbors(array)) {
            System.out.println("В переданном массиве есть два соседних элемента, с нулевым значением!");
        } else {
            System.out.println("В переданном массиве нет соседних элементов, с нулевым значением!");
        }
    }
}