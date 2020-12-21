package Lesson1_1;

public class App {
    public static void main(String[] args) {
        RefTypeExample[] refArray = new RefTypeExample[3];
        refArray[0] = new RefTypeExample("a", 1);
        refArray[1] = new RefTypeExample("b", 2);
        refArray[2] = new RefTypeExample("c", 3);

        int[] intArr={1,2,3};
        String[] stringArr={"1","2"};


        System.out.println ("До ");

        for (int i = 0; i <refArray.length ; i++) {
            System.out.println(refArray[i].getString()+refArray[i].getInteger());
        }

        ExchangeTwoArrElements<RefTypeExample> ex= new ExchangeTwoArrElements();
        ex.Exchange(refArray,0,1);

        System.out.println ("После ");
        for (int i = 0; i <refArray.length ; i++) {
            System.out.println(refArray[i].getString()+refArray[i].getInteger());
        }

    }




}
