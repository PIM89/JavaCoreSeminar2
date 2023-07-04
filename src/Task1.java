public class Task1 {
    /**
     * Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) →
     * 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     * @param array Принимает массив целых чисел
     * @return возвращает количество чётных элементов массива.
     */
    static int countEvens(int[] array) {
        if (array == null) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
