package sch_felder;

import java.util.Arrays;
import java.util.Random;

public class Felder {
	Random rnd = new Random();
	public static int sum(int[] a) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i = 0;i<a.length;i++){
			res += a[i];
		}
		return res;
	}

	public static int min(int[] a) {
		// TODO Auto-generated method stub
		int res = a[0];
		for(int i = 0;i<a.length;i++){
			
			if(a[i]<res){
				res = a[i];
			}
		}
		return res;
	}

	public static int max(int[] a) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i = 0;i<a.length;i++){
			if(a[i]>res){
				res = a[i];
			}
		}
		return res;
	}

	public double mean(int[] a) {
		// TODO Auto-generated method stub#
		double res = 0;
		for(int i= 0;i<a.length;i++){
			res += a[i];
		}
		res = res/a.length;
		return res;
	}
	public int[] zufallListe(){
		int a[] = new int[6];
		int number = 0;
		for(int i = 0;i<6;i++){
			number = rnd.nextInt(6)+1;
			System.out.println(number);
			if(checkifnumberisinarray(a,number)){
				i--;
			}else{
				a[i] = number;
			}
			
		}
		
		return a;
	}

	private boolean checkifnumberisinarray(int array[],int number) {
		// TODO Auto-generated method stub
		 for(int i=0; i< array.length; i++)  {
		     if(number ==array[i] ) {
		       return true;
		     }
		   }
		return false;
	}

	public void printarray(int a[]) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("##");
		for(int i= 0; i < a.length; i++){
			if(i == 0){
				System.out.print("Array: ["+a[i]);
			}else if(i == a.length-1){
				System.out.print(";"+a[i]+"]");
			}else{
				System.out.print(";"+a[i]);
			}
		}
		System.out.println("");
		System.out.println("##");
		System.out.println("");
	}
}
