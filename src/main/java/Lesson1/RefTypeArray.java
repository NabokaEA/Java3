package Lesson1;

public class RefTypeArray<T> {

    private T[] refArr;

   RefTypeArray(T[] refArr) {
        this.refArr = refArr;
    }

    public T[] getRefArr() {
        return refArr;
    }
}
