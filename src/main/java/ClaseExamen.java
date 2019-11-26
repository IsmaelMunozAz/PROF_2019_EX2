import java.util.ArrayList;
import java.util.List;

import exception.EntradaInvalida;

public class ClaseExamen {

	public static List<Integer> primos(int n) throws Exception{
		List<Integer>result= new ArrayList<Integer>();
		if(n<=0 || n==1) {
			throw new EntradaInvalida();
		}
		while(n>1) {
			if(n%2==0) {
				n=n/2;
				result.add(2);
			}else if(n%3==0) {
				n=n/3;
				result.add(3);
			}else if(n%5==0) {
				n=n/5;
				result.add(5);
			}else if(n%7==0){
				n=n/7;
				result.add(7);
			}else {
				result.add(n);
				n=n/n;
			}
		}
		return result;
	}
}
