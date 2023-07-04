public class Task3 {
    /**
     * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с
     * нулевым значением.
     * @param array Принимает массив целых чисел
     * @return Возвращает true или false
     */
    static boolean HasZeroNeighbors(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 & array[i+1] == 0) {
                return true;
            }
        }
        return false;
    }
}
