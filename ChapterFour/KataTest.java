package ChapterFour;

public class KataTest {
    public static void main(String... args){
        Kata kata = new Kata();
        System.out.println("the avarage is " + kata.calculateAverage(10, 13, 15));
        var grade = kata.calculateGrade(60);
        System.out.println( grade);
        System.out.println( kata.calculateGrade(70));
        System.out.println("is even is : "+ (kata.isEven(3)));
    }
}
