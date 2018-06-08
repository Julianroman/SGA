package personas;
//INVESTIGAR ID
public abstract class Persona {
	
	public Persona(int documento, String nombre, String apellido) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	private int documento;
	
	private int legajo;
	
	private String nombre;
	
	private String apellido;
	
	// GETTERS AND SETTERS

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

}
