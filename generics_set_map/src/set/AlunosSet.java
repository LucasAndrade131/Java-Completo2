package set;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlunosSet {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
	
		System.out.print("Quantos alunos para o curso A? ");
		
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
		    int number = scanner.nextInt();
		    a.add(number);
		}
		System.out.print("How many students for course B? ");
		n = scanner.nextInt();
		for (int i=0; i<n; i++) {
			int number = scanner.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = scanner.nextInt();
		for (int i=0; i<n; i++) {
			int number = scanner.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		scanner.close();
	}
}