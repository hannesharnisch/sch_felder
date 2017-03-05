package sch_felder;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,4,6,3,9,13,67,5};
		
	
		Felder feld = new Felder();
		int max = feld.max(a);
		int min = feld.min(a);
		int sum = feld.sum(a);
		double mean = feld.mean(a);
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
		System.out.println(mean);
		feld.printarray(a);
		a = feld.zufallListe();
		feld.printarray(a);
		
	}

}
