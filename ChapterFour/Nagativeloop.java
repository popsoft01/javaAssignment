package ChapterFour;

public class Nagativeloop {
    public static void main(String[] args) {
       // for(int i = 0; i<10; i--)
       //     System.out.println(i);

        int i = 10;
        while(i >= 1){
            System.out.print(--i +" ");
        }

    }
}
