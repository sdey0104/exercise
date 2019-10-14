package ClassesAndObjects;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

//    public void setReal(double real) {
//        this.real = real;
//    }
//
//    public void setImaginary(double imaginary) {
//        this.imaginary = imaginary;
//    }

    public void add (double real, double imaginary){

        this.real = (getReal() + real);
        this.imaginary = (getImaginary() + imaginary);
    }

    public  void add(ComplexNumber complexNumber){
        this.real= (getReal() + complexNumber.getReal());
        this.imaginary= (getImaginary() + complexNumber.getImaginary());
    }



    public void subtract (double real, double imaginary){

        this.real = (getReal() - real);
        this.imaginary = (getImaginary() - imaginary);
    }

    public  void subtract(ComplexNumber complexNumber){
        this.real = (getReal() - complexNumber.getReal());
        this.imaginary = (getImaginary() - complexNumber.getImaginary());
    }

}

