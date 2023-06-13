package notas;

import java.util.Scanner;

public class NotasOb {

	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
		
		int notas[] = new int[5];
		int sum = 0;
		int notaMax = 0;
		int notaMin = 10;
		
		for (int i=0; i<notas.length; i++) {
			System.out.print("Ingrese la nota " + (i+1) + ": ");
			int nota = tc.nextInt();
			while (nota < 0 || nota > 10) {
				System.out.print("Ingrese una nota valida (entre 0 y 10): ");
				nota = tc.nextInt();
			}
			notas[i] = nota;
			sum += nota;
			if (nota > notaMax) {
				notaMax = nota;
			}
			if(nota < notaMin) {
				notaMin = nota;
			}
		}
	System.out.println("Notas ingresadas:");
	for (int nota : notas) {
		System.out.println(nota);
	}
	double prom = (double) sum / notas.length;
	System.out.println("Nota media: " + Math.floor(prom));
	System.out.println("Nota mas alta: " + notaMax);
	System.out.println("Nota mas baja: " + notaMin);
	}
}
