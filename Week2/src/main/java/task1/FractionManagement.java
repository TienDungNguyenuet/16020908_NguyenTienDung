package task1;

public class FractionManagement {
    public static void main(String[] args) {
        Fraction p1 = new Fraction(1,3);
        Fraction p2 = new Fraction(50 , 100);
        FractionManagement F = new FractionManagement();
        System.out.println(F.equals(p1, p2));
    }

    public Fraction add(Fraction p1, Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getDenominator() + p2.getNumerator() * p1.getDenominator());
        p.setDenominator( p1.getDenominator() * p2.getDenominator()) ;
        return  p;
    }

    public Fraction subtract (Fraction p1 , Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getDenominator() - p2.getNumerator() * p1.getDenominator()) ;
        p.setDenominator(p1.getDenominator() * p2.getDenominator()) ;
        return p;
    }

    public Fraction multiply (Fraction p1 , Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getNumerator()) ;
        p.setDenominator(p1.getDenominator() * p2.getDenominator())  ;
        return p;
    }

    public Fraction devide (Fraction p1 , Fraction p2){
        Fraction p = new Fraction();
        p.setNumerator(p1.getNumerator() * p2.getDenominator()) ;
        p.setDenominator(p1.getDenominator() *  p2.getNumerator()) ;
        return p;
    }

    public Fraction reduce( Fraction p){
        Week3Task1 a = new Week3Task1();
        int gcd = a.gcd(p.getNumerator(),p.getDenominator());
        p.setNumerator(p.getNumerator() / gcd) ;
        p.setDenominator(p.getDenominator() / gcd);
        return p;
    }

    public boolean equals(Fraction p1, Fraction p2){
        if(p1.getNumerator() * p2.getDenominator() == p2.getNumerator() * p1.getDenominator()) return true;
        else return false;
    }
}
