public class CommonDivisor {
    public static void main(String[] args) {
        int intergerOne = (int) (Math.random()*20);
        int intergerTwo = (int) (Math.random()*20);

        int gcd = 1;
        int divisor = 2;
        while(divisor <= intergerOne   && divisor <= intergerTwo){
            if (intergerOne % divisor == 0 && intergerTwo % divisor ==0)
                gcd = divisor;
            divisor++;


        }
        System.out.println("The Greatest divisor number of "+ intergerOne + " and " + intergerTwo + " is " + gcd);
    }
}
