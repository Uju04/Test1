public class PrimeAndEvenChecker{
    public boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2; i<= Math.sqrt(n); i++){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }
    public boolean isEven (int n){
        return n%2==0;
    }
}