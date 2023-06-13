package Vector10elementos;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
		
		int vector [] = new int[10];
		int i = 0;
		
		while(i<vector.length) {
			System.out.print("Ingrese un numero entero positivo o un numero negativo para salir: ");
		try {
			int n = tc.nextInt();
			if (n < 0) {
				break;
			}
			vector [i] = n;
			i++;
		}catch (Exception e) {
			System.out.println("ERROR: Debe ingresar un numero entero valido!");
			tc.nextLine();
		}
	}
		System.out.println("Elementos del vector: ");
		for (int j=0; j<i; j++) {
			System.out.println(vector[j]);
		}
	}

}
