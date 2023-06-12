package negocio;

import modelo.Modelo;

public interface IModelo {
	
	public void insertarModelo(Modelo modelo);
	
	public Modelo[] listarModelos();
	
	
}
