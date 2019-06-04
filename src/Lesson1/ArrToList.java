package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

class ArrToList<T> {

    private T[] arr;


    private ArrToList(T[] arr){

        this.arr = arr;
    }

    private ArrayList<T> arrToList(){

        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {

        String[] words = new String[]{"Hello", "Bye", "Whats your name?"};
        Integer[] nums = new Integer[]{10, 20, 30, 40};


        ArrayList<String> wordsList = new ArrToList<>(words).arrToList();
        ArrayList<Integer> numsList = new ArrToList<>(nums).arrToList();

        System.out.println(wordsList);
        System.out.println(numsList);


    }

}
