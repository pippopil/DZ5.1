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



