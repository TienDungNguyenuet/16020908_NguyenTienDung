package task1;

public class Fraction {
    private int numerator;
    private int denominator;

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public  Fraction( int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public  Fraction(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public String ViewFraction(){
        String a = Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
        if(this.denominator == 1) a = Integer.toString(this.numerator);
        return a;
    }

}
