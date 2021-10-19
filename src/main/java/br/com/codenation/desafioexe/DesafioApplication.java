package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> array = new ArrayList<>();
		int num1 = 0;
		int num2 = 1;
        int result;
		for(int index = 0; index < 350; index ++) {
			if(num1 > 377) {
				break;
			}
			array.add(num1);
			result = num1 + num2;
			num1 = num2;
			num2 = result;
		}
		return array;
	}



	public static Boolean isFibonacci(Integer a) {
		 if(fibonacci().contains(a)) {
			 return true;
		 } else {
			 return false;
		 }
	}

}