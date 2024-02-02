package edu.controladores;

import java.util.ArrayList;
import java.util.List;

import edu.Dtos.mesYNombre;
import edu.servicios.mesDiaImplementacion;
import edu.servicios.mesDiaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<mesYNombre> nom = new ArrayList<>();
		
		mesDiaInterfaz mes = new mesDiaImplementacion();
		
		
		mes.pide(nom);
	}

}
