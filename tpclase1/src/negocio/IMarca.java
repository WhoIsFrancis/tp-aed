package negocio;

import modelo.Marca;

public interface IMarca {
	
	public void insertarMarca(Marca marca);
	
	public void listarMarcas();
	
	public Marca buscarMarcas(String marca);
	
	
}
