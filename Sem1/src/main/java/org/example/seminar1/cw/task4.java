//Дан массив целых чисел. Верно ли, что массив симметричен.

package org.example.seminar1.cw;

public class task4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};
         //int[] arr = {1,2,3,1,1};

        System.out.print(simmetr(arr));
    }

    /**
     *
     * @apiNote Проверка на симметричность
     * @param arr входной массив
     * @return результат
     */
    private static boolean simmetr(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }

        }
        return true;
    }
}
