package com.codechef;

public class Main {

    public static void main(String[] args) {
	/*
	       101
	     101101101
	   101101101101101
  101101101101101101101101
	 */
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i+1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<(2*i-1);k++){
            System.out.print("101");
        }
        System.out.println();
    }
    }
}
