package ParameterizedTest;

public class PrimeNumberChecker {
    public Boolean validate(Integer num){
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
