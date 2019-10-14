package ClassesAndObjects;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {

        return getFirstNumber()+getSecondNumber();
    }

    public double getSubtractionResult(){
        return getSecondNumber()-getFirstNumber();
    }

    public double getMultiplicationResult(){
        return getFirstNumber()*getSecondNumber();
    }

    public double getDivisionResult() {
        if (getSecondNumber() == 0) {
            return 0;
        } else {
            return getFirstNumber() / getSecondNumber();
        }
    }



}
