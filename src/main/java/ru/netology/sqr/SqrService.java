package ru.netology.sqr;

public class SqrService {
    public int calculateTheSquareOfNumbers(int lowerBound, int finalBoundary) {
        int resultat = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= lowerBound & i*i<= finalBoundary){
                resultat++;
            }
        }
        System.out.println(resultat);
        return resultat;
    }
}



    //public long calculate(long amount, boolean registered) {
    //int percent = registered ? 3 : 1;
       // long bonus = amount * percent/100/100;
      //  long limit =500;
      //  if (bonus > limit) {
          //  bonus = limit;
     //   }
      //  return bonus;
   // }
//}
