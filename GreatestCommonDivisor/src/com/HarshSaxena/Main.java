package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getGreatestCommonDivisor(25, 50);
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if((first >= 10) && (second >= 10)){
            for(int i = first; i > 0; i--){
                if((first % i == 0) && (second % i == 0)){
                    System.out.println(i);
                    return i;
                }
            }

        }
        return -1;
    }

}
