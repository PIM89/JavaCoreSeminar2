public class Task2 {
    /**
     * Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами
     * переданного не пустого массива.
     * @param array Принимает массив целых чисел
     * @return Возвращаем разницу между максимальным и минимальным элементами
     */
    static int difMaxMin(int[] array) {
        if (array == null) {
            return 0;
        } else {
            int max = array[0], min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return max - min;
        }
    }
}
