package Test;

import java.util.ArrayList;
import java.util.List;

public class TestCovariancia {

	public static void main(String[] args) {
		
		//covariância
//		List<Integer> intList = new ArrayList<Integer>();
//		intList.add(10);
//		intList.add(5);
//		List<? extends Number> list = intList;
//		Number x = list.get(0);
//		//list.add(20); // erro de compilacao
		
		//contravariância
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0); // erro de compilacao
		
	}

}
