package org.example._98_functional_programming;

public class PrimeCheckTest {
    public static void main(String[] args) {
        PrimeCheck primeCheck=n->{
          for(int i=2;i<n/2;i++){
              if(n%i==0)
                  return false;
          }
            return true;
        };
        System.out.println(primeCheck.isPrime(11));
    }
}
