package test;

import java.util.ArrayList;

import daos.DaoBicicleta;
import entidades.Bicicleta;

public class TestDaoBicicletas {
	
	public static void main(String[] args) {
		
		
		DaoBicicleta daoBici = new DaoBicicleta();
		/*ArrayList<Bicicleta> prueba = daoBici.listadoBicicletas();
		
		for (Bicicleta bicicleta : prueba) {
			System.out.println(bicicleta.toString());
		}
		*/
		
		/*ArrayList<Bicicleta> pruebaMarca = daoBici.listadoBicicletasTrampa();
		for (Bicicleta bicicleta : pruebaMarca) {
			System.out.println(bicicleta.toString());
		}
		
		*/
		
		/*ArrayList<Bicicleta> pruebaMarca2 = daoBici.listadoBicicletaPorMarca("cannondale");
		for (Bicicleta bicicleta : pruebaMarca2) {
			System.out.println(bicicleta.toString());
			
		}
		
		*/
		
		ArrayList<Bicicleta> pruebaFinal = daoBici.listadoBicicletasMarcaOrdenFavorito("bh", "ascendente", "true");
		for (Bicicleta bicicleta : pruebaFinal) {
			System.out.println(bicicleta.toString());
		}
	}

}
