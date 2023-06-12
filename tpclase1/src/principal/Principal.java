package principal;

import modelo.Marca;
import negocio.IAuto;
import negocio.IMarca;
import negocio.impl.NegocioMarcaImpl;

public class Principal {

	private static IMarca iMarca;
	private static IAuto iAuto;
	
	
	public static void main(String[] args) {
		//se imyecta una instancia de la clase NegocioMarcaImpl en la interfaz 
		iMarca=(IMarca)new NegocioMarcaImpl();
		Marca marca1= new Marca();
		marca1.setMarca("Ford");
		iMarca.insertarMarca(marca1);
		iMarca.listarMarcas();
		
		Marca marca2= new Marca();
		marca2.setMarca("Peugeot");
		iMarca.insertarMarca(marca2);
		iMarca.listarMarcas();
		
		//Dar de alta un par de modelos
		
		//Dar de alta un par de autos.
		
	}
}
