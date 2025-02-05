package studio3;

public class Sieve {

	public static void main(String[] args) {
		int limit = 40;
		boolean[] isPrime = new boolean [limit+1];
		
		for (int i = 2; i<limit; i++) {
			isPrime[i] = true;
		}
			
		for (int num = 2; num*num<=limit; num++) {
			if(isPrime[num]) {
				for (int multiple = num * num; multiple <= limit; multiple += num) {
                    isPrime[multiple] = false;
				}
            }
        }
                    
        System.out.print("质数列表（<= " + limit + "）：");
        for (int j = 2; j<=limit; j++) {
        	if (isPrime[j]) {
        		System.out.println(j + " ");
            }
        }
    }
}	
        	
        	
        	