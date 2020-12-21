package Lesson1;

import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {
        RefTypeExample[] refArray = new RefTypeExample[3];
        refArray[0] = new RefTypeExample("a", 1);
        refArray[1] = new RefTypeExample("b", 2);
        refArray[2] = new RefTypeExample("c", 3);

        int[] intArr={1,2,3};
        System.out.println(intArr.getClass().getSuperclass());
        String[] stringArr={"1","2"};

        RefTypeArray refTypeArray = new RefTypeArray<RefTypeExample>(refArray);

        ExchangeTwoElementsOfRefTypeArray(refTypeArray,0,1);

    }


    public static <T> void ExchangeTwoElementsOfRefTypeArray(T[] objArr, int a, int b) {
        T tmp = objArr[a];
        objArr[a]=objArr[b];
        objArr[b]=tmp;

    }


}
