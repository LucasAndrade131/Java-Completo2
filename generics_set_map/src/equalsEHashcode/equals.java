package equalsEHashcode;

import entities.Client;

public class equals {

	public static void main(String[] args) {
//		String a = "Maria";
//		String b = "Alex";
//		System.out.println(a.equals(b));
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
	}

}
