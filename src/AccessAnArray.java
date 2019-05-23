
public class AccessAnArray {

	public static void main(String[] args) {
  int [][] myArray= {{5,6,9,1},{1,7,4,3},{1,1,2}};
	for (int[] x:myArray ) {
		for (int i=0; i<x.length; i++) {
		System.out.print(x[i] + "\t" );	
		}
		System.out.println();
	}
		
	}

}
