package ChapterFour;

public class Kata {


    public double calculateAverage(int firstNumber, int secondNumber, int thirdnumber) {
        double result = 0;
        result = (firstNumber + secondNumber + thirdnumber) / 3.0;

        return result;
    }

    public String calculateGrade(int Score) {

        if (Score >= 90) {
            return "A";
        } else if (Score >= 80) {
            return "B";
        } else if (Score >= 70) {
            return "C";
        } else {
            return "f";
        }
    }
    public boolean isEven(int number){
            if (number % 2 == 0){
                return true; 
            }
                else
                    return false;

        }


    }

