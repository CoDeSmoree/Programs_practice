public class Recursion1to10 {
    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }
    static int countDig(int n){
        if(n==0){
            return 0;
        }
        return 1+countDig(n/10);
    }
    static int reverse(int n, int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    static int fib(int n)
    {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        print(10);
        System.out.println();
        System.out.println(sumOfDigits(1234));
        System.out.println(countDig(98473487));
        System.out.println(reverse(829408129,0));
        System.out.println(power(2,5));
        System.out.println(fib(8));

    }
}

