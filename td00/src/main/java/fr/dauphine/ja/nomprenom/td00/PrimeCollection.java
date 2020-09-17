package fr.dauphine.ja.nomprenom.td00;

import java.util.ArrayList;
import java.util.Random;
/**
 * Hello World!
 *
 */
public class PrimeCollection {
	
	
	private java.util.ArrayList<Integer> numbers;

	
	
	public PrimeCollection(ArrayList<Integer> numbers) {
		super();
		this.numbers = numbers;
	}
 
	
	public void initRandom(int n, int m) {
		for (int i =0; i<n ; i++) {
			this.numbers.add((int) (Math.random() * (m))) ;
		}
	}
	
	
	public boolean isPrime(int p) {
		for (int i =2 ; i<Math.sqrt(p)+1; i++) {
			
			if ((p%i)==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public void printPrimes() {
		for (int i =0; i<numbers.size(); i++ ) {
			if (isPrime(numbers.get(i)) == true) {
				System.out.println(numbers.get(i));
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<>();
		
		PrimeCollection col = new PrimeCollection(list);
		
		col.initRandom(100, 1000);
			
	col.printPrimes();
	}
	
	
	
}


