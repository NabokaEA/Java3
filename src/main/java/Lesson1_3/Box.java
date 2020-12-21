package Lesson1_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> box;

    private Double boxWeight = 0.0;

    public Box() {
        this.box = new ArrayList<T>();
    }

    public Double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(Double boxWeight) {
        this.boxWeight = boxWeight;
    }

    public double getWeight() {
        setBoxWeight(0.0);
        for (T t : box) {
            boxWeight = boxWeight + t.getWeight();

        }
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> boxToCompare) {
        return (Math.abs(this.getWeight() - boxToCompare.getWeight()) < 0.000001);
    }


    public void add(T fruit) {
        box.add(fruit);
    }

    public void reLoad(Box<T> source) {
        this.box.addAll(source.box);
        source.box.clear();
    }
}