public class PrimeNumbers{
    public static void main(string[] args){
        for(int number =2; number <= 500; number++){
            boolean isprime = true;
            for (int divisor =2; divisor< number; divisor++) {
                if (number % divisor == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(number + " ");
                }
            }
        }
    }
