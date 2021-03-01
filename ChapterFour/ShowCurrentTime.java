package ChapterFour;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/1000;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = currentSeconds/ 60;

        long curentMinutes = totalMinutes % 60;

        long totalHours = curentMinutes / 60;

        long currentHours = totalHours % 24;

        System.out.println("The time is " + currentHours +" hrs "+curentMinutes +" Min " + currentSeconds + " seconds");
    }
}
