package eu.ase.ro;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		int v[] = {1, 3, 2, 1, 1};
		int frequency = 0;
		
		//Utils u;
		//u.function(v, k)
		frequency = Utils.frequencyOfMin(v, n);
		System.out.println(frequency);
	}

}
