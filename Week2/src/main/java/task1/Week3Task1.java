package task1;

public class Week3Task1 {
    public static void main(String[] args) {
        Week3Task1 obj = new Week3Task1();
        System.out.println(obj.gcd(12,30));
        System.out.println(obj.fibonacci(10));
        obj.sieveEratosthenes(20);
    }
    // compute greatest common divisor of $a and $b
    public int gcd(int a, int b) {
        while (a*b != 0){
            if (a > b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        return a + b;
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        int result;
        if(n==0){
            result = 0;
        }
        else if(n==1){
            result = 1;
        }
        else if(n<0){
            result = -1;
        }
        else{
            result = fibonacci(n-1) + fibonacci(n-2);
        }
        return result;

    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {
        boolean[] a = new boolean[1000];
        for (int i = 2; i < n; i++) {
            a[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if(a[i]){
                System.out.print(i+" ");
                int y = 2;
                while(i*y<n){
                    a[i*y] = false;
                    y++;
                }
            }
        }
    }

}
