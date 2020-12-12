package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=13;
		boolean flag =false;
		for(int j=2;j<+i/2;j++) { // loop variable j
			if(i%j==0) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("13 is Prime Number");
		}
		else {
			System.out.println("Not a Prime number");
		}
	}
}

