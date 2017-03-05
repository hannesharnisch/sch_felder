package sch_felder;

public class Felder {
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
}
