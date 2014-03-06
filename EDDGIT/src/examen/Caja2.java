package examen;

public class Caja2 {
	
	public String idCaja;		// id (codigo de barras) qupackage camion;e identifica a la caja	
	public String contenido;	// descripcion del contenido de la caja
	public double peso;			// peso de la caja y su contenido
	
	
	
	
	public Caja2(String idCaja, String contenido, double peso) {
		super();
		this.idCaja = idCaja;
		this.peso = peso;
		this.contenido = contenido;
	}


	@Override
	public String toString() {
		return "\n\tCaja [" + "idCaja=" + idCaja + " ,contenido=" + contenido + ", peso=" + peso + "]";
	}
	
	
	

}
