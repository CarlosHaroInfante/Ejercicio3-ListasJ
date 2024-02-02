package edu.servicios;

import java.util.List;
import java.util.Scanner;

import edu.Dtos.mesYNombre;

public class mesDiaImplementacion implements mesDiaInterfaz{
	
	Scanner sc = new Scanner(System.in);
	

	
	public void pide (List<mesYNombre> listaAntigua) {
		
		System.out.println("Dame el Nombre de cada mes (12 es el número máximo)");
		mesYNombre nomM = new mesYNombre();
		
		
		
		for(int i = 1; i >= 13; i++) {
			if(i < 12) {
			System.out.println("Dame el número del mes");
			int mes = sc.nextInt();
			nomM.setNumMes(mes);
			
			System.out.println("Dame el nombre de ese mes");
			String nom = sc.next();
			nomM.setNomMes(nom);
			
			listaAntigua.add(nomM);
			}
			else {
				System.out.println("No has dado un número de mes válido");
			}
		}
		
		
		
	}
}
