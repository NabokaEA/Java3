package Lesson1;

public  class ExchangeTwoArrElements <T>{
    public void Exchange(T[] objArr, int a, int b) {
        T tmp = objArr[a];
        objArr[a]=objArr[b];
        objArr[b]=tmp;
    }
}
