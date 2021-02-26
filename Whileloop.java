package ChapterFour;

public class Whileloop {
    public static void main(String[] args) {
        int counter = 0;
        int sum= 1;
        while(counter < 10){
            sum = sum + counter;
            System.out.println("I love Java, becuse is a brain teser " + sum+ " " + counter);
            counter++;
        }
    }
}
