package ChapterFour;

public class FizzBuzz {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 100){
            i++;
            if (i % 3 ==0 && i % 5 ==0)
                System.out.print("Fizzbuzz"+  " ");
            else if(i % 3==0)
                System.out.print("fizz"+ " ");
            else if (i % 5 ==0)
                System.out.print("BUZZ" + " ");
            else
                System.out.print(i+" ");
        }
    }
}
