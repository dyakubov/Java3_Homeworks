package Lesson1.task3;


import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruits;

    private Box() {
        this.fruits = new ArrayList<>();
    }

        private float getWeight (){
        float weight = 0;
        for (T s : fruits) {
            weight += s.getWeight();
        }
        return weight;
    }

    private boolean compare (Box<?> another){

        return this.getWeight() == another.getWeight();
    }

    private void add(T t){

        this.fruits.add(t);
    }

    private void move (Box<? super T> another){
        for (T s: this.fruits
             ) {
            another.add(s);
        }
            this.fruits.clear();
    }

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();


        for (int i = 0; i < 6; i++) {
            appleBox1.add(new Apple());
        }

        for (int i = 0; i < 4; i++) {
            orangeBox.add(new Orange());
        }


        System.out.println("appleBox1: " + appleBox1.getWeight());
        System.out.println("appleBox2: " + appleBox2.getWeight());
        System.out.println("orangeBox: " + orangeBox.getWeight());

        System.out.println(appleBox1.compare(orangeBox));

        appleBox1.move(appleBox2);

        System.out.println("appleBox1: " + appleBox1.getWeight());
        System.out.println("appleBox2: " + appleBox2.getWeight());
        System.out.println("orangeBox: " + orangeBox.getWeight());




    }

}
