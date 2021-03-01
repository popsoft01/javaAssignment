package PersionerClass;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 20000;
        int year = 0;
        while (tuition < 40000){
            tuition = tuition* 1.07;
            year++;
        }
        System.out.println("tution will be doubled in " + year + " year");
        System.out.printf("Tution will be #%.2f in %1d year", tuition, year);
    }
}
