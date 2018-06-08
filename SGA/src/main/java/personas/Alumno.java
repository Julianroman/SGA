package personas;

public class Alumno extends Persona{

	public Alumno(int documento, String nombre, String apellido){
		super(documento, nombre, apellido);
		this.pagoLibreta = false;
		this.fotocopiaDni = false;
		this.tituloLegalizado = false;
		this.fichaInscripcion = false;
	}
	
	private boolean pagoLibreta;
	private boolean libretaEntregada;
	private boolean tituloLegalizado;
	private boolean fotocopiaDni;
	private boolean fichaInscripcion;
	
	public boolean completoInscripcion(){
		return this.pagoLibreta && this.tituloLegalizado && this.fotocopiaDni && this.libretaEntregada && this.fichaInscripcion;
	}
	
	

}
