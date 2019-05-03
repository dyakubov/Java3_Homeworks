package Lesson1;

public class ArrSwapper<T> {
    private T[] arr;

    @SafeVarargs
    private ArrSwapper(T... arr){

        this.arr = arr;
    }

    private void swapArr (int index1, int index2){

        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        for (T s :arr) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {

        ArrSwapper<String> arr1 = new ArrSwapper<>("Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть");
        ArrSwapper<Integer> arr2 = new ArrSwapper<>(0, 1, 2, 3, 4, 5, 6);

        arr1.swapArr(0, 5);
        arr2.swapArr(0, 5);

    }


}
