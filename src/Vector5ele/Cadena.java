package Vector5ele;

import java.util.Scanner;

public class Cadena {

	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		 
		int cant = 0;
		 System.out.println("Ingrese el tamaño del vector");
		 cant= tc.nextInt();
		 tc.nextLine();
		 String[] vectororig= new String[cant];
		 System.out.println("Ingrese los elementos del vector");
		 for(int i=0; i<cant; i++) {
			 System.out.println("Elementos"+(i+1)+":");
			 vectororig[i]=tc.nextLine();
		 }
		 String[] vectorinver= new String [cant];
		for (int i=0;i<cant; i++) {
			vectorinver[i]=vectororig[cant-1-i];
		}
		System.out.println("El vector inversor es: ");
		for (int i=0; i<cant; i++) {
			System.out.println(vectorinver[i]);
		}
		 
		 
			
			}
		}
