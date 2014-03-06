package examen;

public class Caja {
	
	public String idCaja;		// id (codigo de barras) qupackage camion;e identifica a la caja	
	public String contenido;	// descripcion del contenido de la caja
	public double peso;			// peso de la caja y su contenido
	//
	
	/**
	 * @author david
	 * @param idCaja
	 * @param contenido
	 * @param peso
	 * constructor que recibe las cajas su peso y el contenido
	 */
	
	public Caja(String idCaja, String contenido, double peso) {
		super();
		this.idCaja = idCaja;
		this.peso = peso;
		this.contenido = contenido;
	}

	/**
	 * metodo para escribir el resultado
	 * @return string con lo que mostrara en pantalla
	 */
	@Override
	public String toString() {
		return "\n\tCaja [" + "idCaja=" + idCaja + " ,contenido=" + contenido + ", peso=" + peso + "]";
	}
	
	
	

}
