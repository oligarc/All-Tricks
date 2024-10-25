package test;

import java.util.ArrayList;

import daos.DaoBicicleta;
import entidades.Bicicleta;

public class TestDaoBicicletas {
	
	public static void main(String[] args) {
		
		
		DaoBicicleta daoBici = new DaoBicicleta();
		ArrayList<Bicicleta> prueba = daoBici.listadoBicicletas();
		
		for (Bicicleta bicicleta : prueba) {
			System.out.println(bicicleta.toString());
		}
	}

}
