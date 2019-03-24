package com.corejava;

import java.util.Scanner;

class Sample{
	public static void main(String[] args) {
		Boolean flagPrime=false,flagfibo=false;
		int firstTerm = 0,secondTerm = 1,thirdTerm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int inputNumber = sc.nextInt();
		if(inputNumber<=1){
			flagPrime=false;
		}
		for (int i = 2; i < Math.sqrt(inputNumber); i++) {
			if(inputNumber % i==0){
				flagPrime=false;
			}else{
				flagPrime=true;
			}
		}
		while (thirdTerm < inputNumber){
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
		if(thirdTerm == inputNumber){
			flagfibo=true;
		}
		if(flagfibo.equals(true) && flagPrime.equals(true)){
			System.out.println("output should be  "+0);
		}else{
			System.out.println("output should be  "+1);
		}
	}
}
