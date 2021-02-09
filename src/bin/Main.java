package bin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        for (int i = 0; i < array.length; i++){
            array[i] = i+2;
        }
            merge(array, 2,35);
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int[] array, int num, int value){
        try {
            array[num] += value;
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}


