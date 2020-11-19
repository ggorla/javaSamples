package wrapperClasses;

public class thirdWrapperClass {
    public static void main(String[] args) {

        //Ayto Boxing
        int a = 100;
        Integer b = a;
        System.out.println("AutoBoxing"+b);

        //Boxing
        int x = 90;
        Integer y = Integer.valueOf(x);
        System.out.println("boxing"+y);


        // when we are converting Object of wrapper class to its respective premitive type

        //unboxing
        Integer marks = 98;
        System.out.println(marks.intValue());

        //AutoUnboxing
        Integer results = 78;
        int newMarks = results;
        System.out.println(newMarks);
    }
}
